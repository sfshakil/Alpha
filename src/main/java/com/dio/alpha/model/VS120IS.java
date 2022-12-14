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
public class VS120IS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ll_sre ;
    private String sl_sre ;
    private String ft_sre ;
    private String settlement_currency ;
    private String clearing_currency ;

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

    private String issuer_original_credit_count ;
    private String issuer_original_credit_clearing_amount;
    private String issuer_original_credit_clearing_amount_dr_cr ;
    private String issuer_original_credit_iv_credit ;
    private String issuer_original_credit_iv_debit;





    private String issuer_dispute_resp_fin_rvrsl_count;
    private String issuer_dispute_resp_fin_clearing_rvrsl_amount;
    private String issuer_dispute_resp_fin_clearing_amount_rvrsl_dr_cr;
    private String issuer_dispute_resp_fin_iv_rvrsl_credit;
    private String issuer_dispute_resp_fin_iv_rvrsl_debit;

    private String issuer_total_pur_count;
    private String issuer_total_pur_clearing_amount;
    private String issuer_total_pur_dr_cr;
    private String issuer_total_pur_iv_credit;
    private String issuer_total_pur_iv_debit;

    private String issuer_net_pur_iv_credit;
    private String issuer_net_pur_iv_debit;

    private String issuer_total_original_cash_count;
    private String issuer_total_original_cash_clearing_amount;
    private String issuer_total_original_cash_clearing_amount_dr_cr;
    private String issuer_total_original_cash_iv_credit;
    private String issuer_total_original_cash_iv_debit;

    private String issuer_net_original_cash_iv_credit;
    private String issuer_net_original_cash_iv_debit;

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

    private String issuer_total_original_credit_count;
    private String issuer_total_original_credit_clearing_amount;
    private String issuer_total_original_credit_clearing_amount_dr_cr;
    private String issuer_total_original_credit_iv_credit;
    private String issuer_total_original_credit_iv_debit;

    private String issuer_total_count;
    private String issuer_total_clearing_amount;
    private String issuer_total_dr_cr;
    private String issuer_total_iv_credit;
    private String issuer_total_iv_debit;

    private String issuer_net_iv_credit;
    private String issuer_net_iv_debit;

    private String issuer_net_original_credit_iv_credit;
    private String issuer_net_original_credit_iv_debit;
}
