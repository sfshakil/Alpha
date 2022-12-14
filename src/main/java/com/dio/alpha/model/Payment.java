package com.dio.alpha.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Payment {
    private String issuer_original_sale_count ;
    private String issuer_original_sale_clearing_amount ;
    private String issuer_original_sale_clearing_amount_dr_cr ;
    private String issuer_original_sale_iv_credit;
    private String issuer_original_sale_iv_debit ;

    private String issuer_original_sale_rvrsl_count ;
    private String issuer_original_sale_rvrsl_clearing_amount ;
    private String issuer_original_sale_rvrsl_clearing_amount_dr_cr ;
    private String issuer_original_sale_rvrsl_iv_credit ;
    private String issuer_original_sale_rvrsl_iv_debit ;

    private String issuer_dispute_resp_fin_count;
    private String issuer_dispute_resp_fin_clearing_amount ;
    private String issuer_dispute_resp_fin_clearing_amount_dr_cr ;
    private String issuer_dispute_resp_fin_iv_credit;
    private String issuer_dispute_resp_fin_iv_debit;

    private String issuer_dispute_resp_fin_rvrsl_count;
    private String issuer_dispute_resp_fin_clearing_rvrsl_amount;
    private String issuer_dispute_resp_fin_clearing_amount_rvrsl_dr_cr;
    private String issuer_dispute_resp_fin_iv_rvrsl_credit;
    private String issuer_dispute_resp_fin_iv_rvrsl_debit;

    private String issuer_merchandise_credit_count ;
    private String issuer_merchandise_credit_clearing_amount ;
    private String issuer_merchandise_credit_clearing_amount_dr_cr ;
    private String issuer_merchandise_credit_iv_credit ;
    private String issuer_merchandise_credit_iv_debit ;

    private String issuer_original_cash_count ;
    private String issuer_original_cash_clearing_amount ;
    private String issuer_original_cash_clearing_amount_dr_cr;
    private String issuer_original_cash_iv_credit ;
    private String issuer_original_cash_iv_debit ;

    private String issuer_original_cash_rvrsl_count ;
    private String issuer_original_cash_rvrsl_clearing_amount ;
    private String issuer_original_cash_rvrsl_clearing_amount_dr_cr ;
    private String issuer_original_cash_rvrsl_iv_credit ;
    private String issuer_original_cash_rvrsl_iv_debit ;

    private String issuer_original_cash_dispute_fin_count;
    private String issuer_original_cash_dispute_fin_clearing_amount;
    private String issuer_original_cash_dispute_fin_clearing_amount_dr_cr;
    private String issuer_original_cash_dispute_fin_iv_credit;
    private String issuer_original_cash_dispute_fin_iv_debit;

    private String issuer_original_cash_dispute_fin_rvrsl_count;
    private String issuer_original_cash_dispute_fin_rvrsl_clearing_amount;
    private String issuer_original_cash_dispute_fin_rvrsl_clearing_amount_dr_cr;
    private String issuer_original_cash_dispute_fin_rvrsl_iv_credit;
    private String issuer_original_cash_dispute_fin_rvrsl_iv_debit;

    private String issuer_original_credit_count ;
    private String issuer_original_credit_clearing_amount;
    private String issuer_original_credit_clearing_amount_dr_cr ;
    private String issuer_original_credit_iv_credit ;
    private String issuer_original_credit_iv_debit;

    List<AccountMapping> accountMappings = new ArrayList<>();
}
