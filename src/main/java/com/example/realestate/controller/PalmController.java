package com.example.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PalmController {

    @GetMapping("/palm")
    public String showPalmPage() {
        return "palm";  // resolves to /WEB-INF/views/lalit.jsp
    }
}
