package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.form.ForecastForm;
import com.portfolio.form.ForecastPeriodForm;

@RequestMapping("/Forecast")
@Controller
public class ForecastController {

	/** 出庫予測数・発注数登録画面を表示 */
	@GetMapping
	public String getForecastRegistration(Model model, ForecastForm form, @ModelAttribute("forecastPeriodForm") ForecastPeriodForm forecastPeriodForm){
//	public String getForecastRegistration(Model model, ForecastForm form, @ModelAttribute("forecastPeriodForm") ModelMap modelMap){
		
//		ForecastPeriodForm forecastPeriodForm = (ForecastPeriodForm)modelMap.get("forecastPeriodForm");
		
//		modelMap　がnull以外のとき、formの期間に値を入れる
		
		model.addAttribute("forecastPeriodForm", forecastPeriodForm);
		
		return "/forecastRegistration";
	}

	public String getForecastRegistration(Model model, ForecastForm form){
		
		return getForecastRegistration(model, form, null);
	}

	
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
