package com.example.meeting.invo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoController {

    @GetMapping("/home")
    public String showHome(){
        return "gd";
    }

}