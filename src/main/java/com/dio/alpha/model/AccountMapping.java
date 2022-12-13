package com.dio.alpha.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class AccountMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String business_type;
    public String channel;
    public String bin;
    public String settlement_currency;
    public String tran_type;
    public String dr_account;
    public String dr_account_currency;
    public String cr_account;
    public String cr_account_currency;
}
