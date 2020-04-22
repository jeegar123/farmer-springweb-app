package com.farmers.app.controller;

import com.farmers.app.model.Farmer;
import com.farmers.app.service.FarmerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FarmerController {

    private final FarmerServiceImpl farmerService;

    public FarmerController(FarmerServiceImpl farmerService) {
        this.farmerService = farmerService;
    }


    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("/register")
    public String registerFarmer() {
        return "registerFarmer";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveFarmer(@ModelAttribute("farmer") Farmer farmer, ModelMap modelMap) {
        farmerService.createFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is successfully saved with username:" + farmer.getUsername());
        return "index";
    }

    @RequestMapping("/delete")
    public String saveFarmer(@RequestParam("id") long id, ModelMap modelMap) {
        Farmer farmer = farmerService.getFarmerById(id);
        farmerService.deleteFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is delete successfully");
        return "index";
    }

    @RequestMapping("/update")
    public String updateFarmer(@ModelAttribute("farmer") Farmer farmer, ModelMap modelMap) {
        farmerService.createFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is successfully update with username:" + farmer.getUsername());
        return "index";
    }

    @RequestMapping("/list")
    public String getFarmerList(ModelMap modelMap) {
        List<Farmer> farmerList = farmerService.getAllFarmers();
        modelMap.addAttribute("farmerList", farmerList);
        return "farmerList";
    }

}
