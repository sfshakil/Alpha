package com.dio.alpha.controller;

import com.dio.alpha.model.*;
import com.dio.alpha.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    Users us;
    @RequestMapping("/dashboard")
    public ModelAndView dashboard(@ModelAttribute Users user, Model model){
        ModelAndView modelAndView = new ModelAndView();
        us =  loginService.findByuser_id(user.getUserId());
        if(us != null && user.getPassword().equals(us.getPassword())){
            model.addAttribute("name",us.getUser_full_name());
            modelAndView.setViewName("dashboard");
        }else{
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    @RequestMapping("/dash")
    public ModelAndView dash(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }

    @RequestMapping("/satelment")
    public ModelAndView satelment(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("satelment");
        return modelAndView;
    }
    @RequestMapping("/import_files")
    public ModelAndView import_files(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("importfiles");
        return modelAndView;
    }
    @RequestMapping("/files_check")
    public ModelAndView start_importing(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("filescheck");
        return modelAndView;
    }
    @RequestMapping("/start_Process")
    public ModelAndView start_Process(){
        ModelAndView modelAndView = new ModelAndView();
        callEPParser();
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }

    public Void callEPParser() {
        final String uri = "http://localhost:8035/vss110/saveVSS110";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity(uri,Void.class);
        return null;
    }

    @RequestMapping("/users")
    public ModelAndView users(Model model){
        List<Users> users = loginService.findAllUsers();
        List<CompanyDivision> allCompanyDivisions = loginService.findAllCompanyDivisions();
        List<CompanyDesignation> allCompanyDesignations = loginService.findAllCompanyDesignations();
        List<CompanyDepartment> allCompanyDepartments = loginService.findAllCompanyDepartments();
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        model.addAttribute("users",users);
        model.addAttribute("allCompanyDivisions",allCompanyDivisions);
        model.addAttribute("allCompanyDesignations",allCompanyDesignations);
        model.addAttribute("allCompanyDepartments",allCompanyDepartments);
        modelAndView.setViewName("users");
        return modelAndView;
    }

    @RequestMapping("/module")
    public ModelAndView module(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("module");
        return modelAndView;
    }

    @RequestMapping("/role")
    public ModelAndView role(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("role");
        return modelAndView;
    }
    @RequestMapping("/company")
    public ModelAndView company(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("company");
        return modelAndView;
    }
    @RequestMapping("/companydivision")
    public ModelAndView companydivision(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("companydivision");
        return modelAndView;
    }

    @RequestMapping("/accountmapping")
    public ModelAndView accountmapping(Model model){
        List<CreditAccount> allCreditAccounts = loginService.findAllCreditAccounts();
        List<DebitAccount> allDebitAccounts = loginService.findAllDebitAccounts();
        List<AccountMapping> accountMappings = loginService.findAllAccounMapping();
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("allCreditAccounts",allCreditAccounts);
        model.addAttribute("allDebitAccounts",allDebitAccounts);
        model.addAttribute("accountMappings",accountMappings);
        model.addAttribute("name",us.getUser_full_name());
        modelAndView.setViewName("accountmapping");
        return modelAndView;
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute Users user, Model model){
        loginService.saveUser(user);
        return "redirect:/users";
    }

    @RequestMapping("/saveAccountMapping")
    public String saveAccountMapping(@ModelAttribute AccountMapping accountMapping, Model model){
        accountMapping.setCr_account_currency("050");
        accountMapping.setDr_account_currency("050");
        loginService.saveAccountMapping(accountMapping);
        return "redirect:/accountmapping";
    }
}
