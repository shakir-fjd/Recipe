package com.ccube.recipe.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String indexPage() {
        System.out.println("In Index after Changes Controller.....");
        return "index";
    }
}
