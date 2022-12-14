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

import java.util.ArrayList;
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

    @RequestMapping("/voucher")
    public ModelAndView voucher(Model model){
        List<VS120IS> vs120ISList = loginService.findAllvs120IS();
        List<AccountMapping> accountMappings = loginService.findAllAccounMapping();
        List<BinTable> binTables = loginService.findAllbin();
        List<Payment> payments = new ArrayList<>();
        List<AccountMapping> maps = new ArrayList<>();
        String vsll_sre = "";
        String vssl_sre = "";
        String vsft_sre = "";


        for (VS120IS vs120IS: vs120ISList) {
            vsll_sre = vs120IS.getLl_sre();
            vssl_sre = vs120IS.getSl_sre();
            vsft_sre = vs120IS.getFt_sre();

            Payment payment = new Payment();
            /*payment.setIssuer_original_sale_count(vs120IS.getIssuer_original_sale_count()) ;*/
            payment.setIssuer_original_sale_clearing_amount(vs120IS.getIssuer_original_sale_clearing_amount()) ;
            /*payment.setIssuer_original_sale_clearing_amount_dr_cr(vs120IS.getIssuer_original_sale_clearing_amount_dr_cr()) ;
            payment.setIssuer_original_sale_iv_credit(vs120IS.getIssuer_original_sale_iv_credit());
            payment.setIssuer_original_sale_iv_credit(vs120IS.getIssuer_original_sale_iv_credit()) ;

            payment.setIssuer_original_sale_rvrsl_count(vs120IS.getIssuer_original_sale_rvrsl_count()) ;*/
            payment.setIssuer_original_sale_rvrsl_clearing_amount(vs120IS.getIssuer_original_sale_rvrsl_clearing_amount()) ;
            /*payment.setIssuer_original_sale_rvrsl_clearing_amount_dr_cr(vs120IS.getIssuer_original_sale_rvrsl_clearing_amount_dr_cr()) ;
            payment.setIssuer_original_sale_rvrsl_iv_credit(vs120IS.getIssuer_original_sale_rvrsl_iv_credit()) ;
            payment.setIssuer_original_sale_rvrsl_iv_debit(vs120IS.getIssuer_original_sale_rvrsl_iv_debit()) ;*/

            payment.setIssuer_dispute_resp_fin_clearing_amount(vs120IS.getIssuer_dispute_resp_fin_clearing_amount()) ;
            payment.setIssuer_dispute_resp_fin_clearing_rvrsl_amount(vs120IS.getIssuer_dispute_resp_fin_clearing_rvrsl_amount()) ;
            payment.setIssuer_merchandise_credit_clearing_amount(vs120IS.getIssuer_merchandise_credit_clearing_amount()) ;
            payment.setIssuer_original_cash_clearing_amount(vs120IS.getIssuer_original_cash_clearing_amount()) ;
            payment.setIssuer_original_cash_rvrsl_clearing_amount(vs120IS.getIssuer_original_cash_rvrsl_clearing_amount()) ;
            payment.setIssuer_original_cash_dispute_fin_clearing_amount(vs120IS.getIssuer_original_cash_dispute_fin_clearing_amount()) ;
            payment.setIssuer_original_cash_dispute_fin_rvrsl_clearing_amount(vs120IS.getIssuer_original_cash_dispute_fin_rvrsl_clearing_amount()) ;
            payment.setIssuer_original_credit_clearing_amount(vs120IS.getIssuer_original_credit_clearing_amount()) ;

            for (BinTable binTable: binTables) {
                if(
                        vsll_sre.replace(" ","").equals(binTable.getLow_level_sre())
                                && vssl_sre.replace(" ","").equals(binTable.getSummary_sre())
                                && vsft_sre.replace(" ","").equals(binTable.getFt_sre()) )
                {

                    for (AccountMapping accountMapping: accountMappings) {
                        if(accountMapping.getBin().equals(binTable.getBin())){

                            AccountMapping mapping = new AccountMapping();
                            mapping.setId(accountMapping.getId());
                            mapping.setBusiness_type(accountMapping.getBusiness_type());
                            mapping.setChannel(accountMapping.getChannel());
                            mapping.setBin(accountMapping.getBin());
                            mapping.setSettlement_currency(accountMapping.getSettlement_currency());
                            mapping.setTran_type(accountMapping.getTran_type());
                            mapping.setDr_account(accountMapping.getDr_account());
                            mapping.setDr_account_currency(accountMapping.getDr_account_currency());
                            mapping.setCr_account(accountMapping.getCr_account());
                            mapping.setCr_account_currency(accountMapping.getCr_account_currency());

                            maps.add(mapping);
                        }
                    }

                }
            }
            payment.setAccountMappings(maps);
            payments.add(payment);
        }

        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("name",us.getUser_full_name());
        model.addAttribute("payments",payments);
        modelAndView.setViewName("invoice");
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
