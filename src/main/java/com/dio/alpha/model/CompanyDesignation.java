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
public class CompanyDesignation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer designation_id;
    public String designation_name;
}
