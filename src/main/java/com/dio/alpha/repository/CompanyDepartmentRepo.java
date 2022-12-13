package com.dio.alpha.repository;

import com.dio.alpha.model.CompanyDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDepartmentRepo extends JpaRepository<CompanyDepartment,Integer> {
}
