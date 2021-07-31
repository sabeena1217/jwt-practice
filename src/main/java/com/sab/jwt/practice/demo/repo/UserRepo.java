package com.sab.jwt.practice.demo.repo;

import com.sab.jwt.practice.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);
}
