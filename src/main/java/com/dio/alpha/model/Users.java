package com.dio.alpha.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String userId;
    public String user_full_name;
    public String division_id;
    public String department_id;
    public String designation_id;
    public String email;
    public String mobile_number;
    public String password;
}
