package com.sab.jwt.practice.demo.repo;

import com.sab.jwt.practice.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
