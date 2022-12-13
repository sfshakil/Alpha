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
public class CompanyDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer department_id;
    public String department_name;
}
