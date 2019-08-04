package com.muhammad.controllers;






import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muhammad.modells.FormattedDate;



@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home() {
		
		return "Home.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		
		FormattedDate calendar = new FormattedDate();
		model.addAttribute("date", calendar);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		
		FormattedDate calendar = new FormattedDate();
		model.addAttribute("date", calendar);
		
		return "time.jsp";
	}
}
