package com.prasoon.petclinic.web.controllers;

import com.prasoon.petclinic.data.model.Owner;
import com.prasoon.petclinic.data.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({ "/owners", "owners", "owners/index.html",
            "owners/index" }) public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/find", "/oups"})
    public String findOwner(){
        return "notimplementedyet";
    }

}
