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
    @PostMapping("/deleteMobile")
    public String deleteMobile(@RequestParam Long id){
        mobileService.deleteMobile(id);
        return "redirect:/mobiles";
    }
    @GetMapping("/updateMobile")
    public String updateMobile(@RequestParam Long id,Model model){
        Mobile mobile=mobileService.getMobile(id);
        model.addAttribute("mobile",mobile);
        return "update_mobile";
    }
    @PostMapping("/processUpdate")
    public String processUpdate(@RequestParam String brand, @RequestParam int ram, @RequestParam int storage, @RequestParam String model, @RequestParam Long id){
        mobileService.updateMobile(id,brand,ram,storage,model);
        return "redirect:/mobiles";
    }
}
