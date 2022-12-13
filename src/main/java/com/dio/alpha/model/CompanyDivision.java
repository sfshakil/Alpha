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
public class CompanyDivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer division_id;
    public String division_name;
}
