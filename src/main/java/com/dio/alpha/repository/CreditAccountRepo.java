package com.dio.alpha.repository;

import com.dio.alpha.model.CreditAccount;
import com.dio.alpha.model.DebitAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditAccountRepo extends JpaRepository<CreditAccount,Integer> {
}
