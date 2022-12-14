package com.dio.alpha.service;

import com.dio.alpha.model.*;
import com.dio.alpha.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CompanyDivisionRepo companyDivisionRepo;
    @Autowired
    private CompanyDesignationRepo companyDesignationRepo;
    @Autowired
    private CompanyDepartmentRepo companyDepartmentRepo;
    @Autowired
    private CreditAccountRepo creditAccountRepo;

    @Autowired
    private DebitAccountRepo debitAccountRepo;
    @Autowired
    private AccountMappingRepo accountMappingRepo;
    @Autowired
    private VS120ISRepo vs120ISRepo;
    @Autowired
    private BinTableRepo binTableRepo;

    public Users findByuser_id(String userId){
        return userRepo.findByUserId(userId);
    }
    public Users saveUser(Users user){
        return userRepo.save(user);
    }
    public List<Users> findAllUsers(){
        return userRepo.findAll();
    }
    public List<CompanyDivision> findAllCompanyDivisions(){
        return companyDivisionRepo.findAll();
    }
    public List<CompanyDesignation> findAllCompanyDesignations(){
        return companyDesignationRepo.findAll();
    }
    public List<CompanyDepartment> findAllCompanyDepartments(){
        return companyDepartmentRepo.findAll();
    }
    public List<CreditAccount> findAllCreditAccounts(){
        return creditAccountRepo.findAll();
    }
    public List<DebitAccount> findAllDebitAccounts(){
        return debitAccountRepo.findAll();
    }
    public AccountMapping saveAccountMapping(AccountMapping accountMapping){
        return accountMappingRepo.save(accountMapping);
    }
    public List<AccountMapping> findAllAccounMapping(){
        return accountMappingRepo.findAll();
    }
    public List<VS120IS> findAllvs120IS(){
        return vs120ISRepo.findAll();
    }
    public List<BinTable> findAllbin(){
        return binTableRepo.findAll();
    }
}
