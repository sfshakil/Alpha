package com.dio.alpha.repository;

import com.dio.alpha.model.BinTable;
import com.dio.alpha.model.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinTableRepo extends JpaRepository<BinTable,Integer> {
}
