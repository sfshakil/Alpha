package com.dio.alpha.repository;

import com.dio.alpha.model.CompanyDepartment;
import com.dio.alpha.model.DebitAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitAccountRepo extends JpaRepository<DebitAccount,Integer> {
}
