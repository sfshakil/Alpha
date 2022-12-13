package com.dio.alpha.repository;

import com.dio.alpha.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUserId(String userId);
}
