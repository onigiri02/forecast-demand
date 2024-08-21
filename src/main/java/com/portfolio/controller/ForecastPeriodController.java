package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.portfolio.beans.ForecastPeriodInfo;
import com.portfolio.form.ForecastPeriodForm;
import com.portfolio.form.GroupOrder;

@Controller
public class ForecastPeriodController {

	
	/** 登録期間指定画面を表示 */
	@GetMapping("/ForecastPeriod")
	public String getForecastPeriod(Model model, ForecastPeriodForm form){
		
		model.addAttribute("forecastPeriodForm", form);
		
		return "/forecastPeriod";
	}
	
	
	/** 登録処理 */
	@PostMapping("/ForecastPeriod")
	public String postEntry(RedirectAttributes redirectAttributes
			, Model model, @ModelAttribute @Validated(GroupOrder.class) ForecastPeriodForm form, BindingResult bindingResult){
		
		// 入力チェック結果
		if(bindingResult.hasErrors()) {
			return getForecastPeriod(model, form);
		}
				
		// リダイレクト先に渡すオブジェクトをセットする
		ForecastPeriodInfo forecastPeriodInfo = new ForecastPeriodInfo();
		forecastPeriodInfo.setForecastPeriodStart(form.getForecastPeriodStart());
		forecastPeriodInfo.setForecastPeriodEnd(form.getForecastPeriodEnd());
		
		redirectAttributes.addFlashAttribute("forecastPeriodInfo", forecastPeriodInfo);

		// 一覧画面を再表示
		return "redirect:/Forecast";
	}
	
}
