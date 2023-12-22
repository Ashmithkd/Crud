package com.crudApplication.crud.mobile.controller;

import com.crudApplication.crud.mobile.entity.Mobile;
import com.crudApplication.crud.mobile.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MobileController {
    @Autowired
    MobileService mobileService;
    @GetMapping("/mobiles")
    public String getAllMobiles(Model model) {
        model.addAttribute("allMobiles",mobileService.getAllMobiles());
        return "view_mobiles";
    }
    @GetMapping("/add_mobile")
    public String addMobile(){
        return "add_mobile";
    }
    @PostMapping("/processMobile")
    public String processMobile(@RequestParam String brand, @RequestParam int ram, @RequestParam int storage, @RequestParam String model){
        Mobile mobile=new Mobile(brand,model,ram,storage);
        mobileService.createMobile(mobile);
        return "redirect:/add_mobile";
    }
}
