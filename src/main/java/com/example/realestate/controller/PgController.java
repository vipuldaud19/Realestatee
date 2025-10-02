package com.example.realestate.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PgController {
	 @GetMapping("/pg")
	    public String home(Model model) {
	        model.addAttribute("pageTitle", "EstateFinders - Find Your Dream Home");
	        return "pg"; // corresponds to index.jsp
}
}