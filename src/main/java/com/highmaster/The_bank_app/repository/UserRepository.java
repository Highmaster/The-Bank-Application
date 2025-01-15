package com.highmaster.The_bank_app.repository;

import com.highmaster.The_bank_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
