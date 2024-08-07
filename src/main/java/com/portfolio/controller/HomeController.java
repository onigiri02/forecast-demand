package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Home")
public class HomeController {
		
	/** システム画面トップ（ホーム）を表示 */
	@GetMapping
	public String getHome(){
		
		// システム画面トップ（ホーム）を表示
		return "/home";
	}
	
}
