package com.dio.alpha.repository;

import com.dio.alpha.model.AccountMapping;
import com.dio.alpha.model.CompanyDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountMappingRepo extends JpaRepository<AccountMapping,Integer> {
}
