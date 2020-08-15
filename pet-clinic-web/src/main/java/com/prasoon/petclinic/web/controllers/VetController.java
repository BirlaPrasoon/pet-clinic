package com.prasoon.petclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {

    @RequestMapping({"","/index.html","/","/index"})
    public String listVets(){
        return "vets/index";
    }

}