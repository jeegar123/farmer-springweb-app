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

//    dependcy injection using contructor
    public FarmerController(FarmerServiceImpl farmerService) {
        this.farmerService = farmerService;
    }

//    call default page index.jsp
    @RequestMapping("/")
    public String index() {
        return "index";
    }

//    call register page for farmer
    @RequestMapping("/register")
    public String registerFarmer() {
        return "registerFarmer";
    }

//    save farmer rto database
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveFarmer(@ModelAttribute("farmer") Farmer farmer, ModelMap modelMap) {
        farmerService.createFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is successfully saved with username:" + farmer.getUsername());
        return "registerFarmer";
    }

//    delete farmer
    @RequestMapping("/delete")
    public String saveFarmer(@RequestParam("id") int id, ModelMap modelMap) {
        Farmer farmer = farmerService.getFarmerById(id);
        farmerService.deleteFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is delete successfully");
        return "index";
    }

//    update farmer details
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateFarmer(@ModelAttribute("farmer") Farmer farmer, ModelMap modelMap) {
        farmerService.createFarmer(farmer);
        modelMap.addAttribute("msg", "farmer is successfully update with username:" + farmer.getUsername());
        return "index";
    }

//    call update page with id attribute
    @RequestMapping("/updatePage")
    public String sayUpdateFarmer(@ModelAttribute("id") int id,ModelMap modelMap){
        Farmer farmer = farmerService.getFarmerById(id);
        modelMap.addAttribute("farmer",farmer);
        return "update";
    }


    @RequestMapping("/list")
    public String getFarmerList(ModelMap modelMap) {
        List<Farmer> farmerList = farmerService.getAllFarmers();
        modelMap.addAttribute("farmerList", farmerList);
        return "farmerList";
    }

}
