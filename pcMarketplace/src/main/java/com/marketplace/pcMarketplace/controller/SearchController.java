package com.marketplace.pcMarketplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping(value = {"/main", "/index"})
    public String index(Model model){
        return "index";
    }

//    @GetMapping(value = "/")
//    public String notFound(){
//        return "notfound";
//    }
}
