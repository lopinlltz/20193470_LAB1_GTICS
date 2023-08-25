package com.example.lab1_20193470.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping(value = "/principal")
    public String principal () {
        return "paginaprincipal";
    }
}
