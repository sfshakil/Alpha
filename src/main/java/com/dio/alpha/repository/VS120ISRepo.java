package com.dio.alpha.repository;

import com.dio.alpha.model.VS120IS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VS120ISRepo extends JpaRepository<VS120IS,Integer> {
}
