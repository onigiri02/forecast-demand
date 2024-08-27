package com.portfolio.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.beans.ForecastPeriodInfo;
import com.portfolio.domain.forecast.model.ForecastCalendar;
import com.portfolio.domain.forecast.service.ForecastService;
import com.portfolio.form.ForecastCalendarForm;
import com.portfolio.form.ForecastForm;
import com.portfolio.form.ForecastPeriodForm;
@RequestMapping("/Forecast")
@Controller
public class ForecastController {
	
	@Autowired
	private ForecastService forecastService;
	
	/** 出庫予測数・発注数登録画面を表示 */
	@GetMapping
	public String getForecastRegistration(Model model, ForecastForm form){
		
//			, @ModelAttribute("forecastPeriodForm") ForecastPeriodForm forecastPeriodForm){
//	public String getForecastRegistration(Model model, ForecastForm form, @ModelAttribute("forecastPeriodForm") ModelMap modelMap){
		
//		ForecastPeriodForm forecastPeriodForm = (ForecastPeriodForm)modelMap.get("forecastPeriodForm");
		
//		modelMap　がnull以外のとき、formの期間に値を入れる（受け口を変えるほうが良い？）
		
       if (model.containsAttribute("forecastPeriodInfo")) {
    	   ForecastPeriodInfo forecastPeriodInfo = (ForecastPeriodInfo) model.getAttribute("forecastPeriodInfo");
           form.setForecastPeriodStart(forecastPeriodInfo.getForecastPeriodStart());
           form.setForecastPeriodEnd(forecastPeriodInfo.getForecastPeriodEnd());
        }
		
		List<ForecastCalendar> forecastCalendar = forecastService.generateForecastCalendar(form.getForecastPeriodStart(), form.getForecastPeriodEnd());
				
		// 取得したデータを画面表示用リストに移し替える
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);	//マッチング戦略を厳しいものに設定
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);	//型の完全マッチなど
        
        List<ForecastCalendarForm> forecastCalendarForm = modelMapper.map(forecastCalendar, new TypeToken<List<ForecastCalendarForm>>() {}.getType());


        // 画面表示用リストの在庫を計算する
        int stock = 0;

//TODO よく考える
// 実績データの在庫が最優先。
// 実績入力時点では、そこまでの在庫を更新するため、在庫の歯抜けはない前提
// 休日カレンダーが途中で変わったらどうするか……それ以前の日付のデータを一度更新するか
// 在庫の歯抜けを許容するか？　あり得る気はする。
// まずどうデータを登録させるか検討したほうが良い。
// 在庫の更新処理を作ったら再度見直すか
        for(ForecastCalendarForm calendar  : forecastCalendarForm){
        	if (/* stock == 0 && */
        			Objects.nonNull(calendar.getStockQuantities())){	
        		stock = calendar.getStockQuantities();
        	} else {
        		if (Objects.nonNull(calendar.getOrderedQuantity())) {
	        		stock += calendar.getOrderedQuantity();
	        	}
            	if (Objects.nonNull(calendar.getIssuedQuantities())) {
            		stock -= calendar.getIssuedQuantities();
            	} else if (Objects.nonNull(calendar.getForecastIssueQuantities())) {
            		stock -= calendar.getForecastIssueQuantities();
            	}
        	}
        	
        	calendar.setTemporaryStockQuantities(stock);
        }
        
// グラフ表示用の項目を配列に変換する
        SimpleDateFormat sdFormat = new SimpleDateFormat("M/d");
        List<String> calendarDateList = new ArrayList<String>();
        List<Integer> temporaryStockQuantitiesList = new ArrayList<Integer>();
        for(ForecastCalendarForm calendar  : forecastCalendarForm) {
        	calendarDateList.add(sdFormat.format(calendar.getCalendarDate()) );
        	temporaryStockQuantitiesList.add(calendar.getTemporaryStockQuantities());
        }
        int listSize = calendarDateList.size();
        

        //TODO 18はマスタに入れる
        for (int i = listSize; i < 18; i++) {
        	calendarDateList.add("");
        	temporaryStockQuantitiesList.add(temporaryStockQuantitiesList.get(listSize - 1)); // 追加データは最終の在庫量とする
        }

        
        
      //配列に変換
        String calendarDateArray[] = calendarDateList.toArray(new String[calendarDateList.size()]);
        Integer temporaryStockQuantitiesArray[] = temporaryStockQuantitiesList.toArray(new Integer[temporaryStockQuantitiesList.size()]);
        
		form.setForecastCalendar(forecastCalendarForm);
		

		
		
		model.addAttribute("forecastForm", form);
	    model.addAttribute("calendarDateArray", calendarDateArray);
	    model.addAttribute("temporaryStockQuantitiesArray", temporaryStockQuantitiesArray);
		
		return "/forecastRegistration";
	}

//	public String getForecastRegistration(Model model, ForecastForm form){
//		
//		return getForecastRegistration(model, form, null);
//	}

	
	/** 登録処理 */
	@PostMapping("/forecast")
	public String postForecastRegistration(Model model, ForecastPeriodForm form){

//	public String postForecastRegistration(Model model, @ModelAttribute @Validated(GroupOrder.class) ForecastPeriodForm form, BindingResult bindingResult){
			
		
//TODO モデルマップを受け取って引き渡せるようにする？
		
		// 入力チェック結果
//		if(bindingResult.hasErrors()) {
//			return getForecastRegistration(model, form);
//		}
		
		
//		// 期間が3か月以内である
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(form.getForecastPeriodStart());
//		calendar.add(Calendar.MONTH, 3);
//		
//		if (calendar.after(form.getForecastPeriodEnd())) {
//			return getForecastPeriod(model, form);
//			
//		}
		
//		ModelMapper modelMapper = new ModelMapper();
		
		// 入力用Formから登録用modelに移し替える
//		TodoItem todoItem = modelMapper.map(form, TodoItem.class);




			
		// 一覧画面を再表示
//TODO リンク先ができたら訂正する
		return "/Home";
	}
	
}
