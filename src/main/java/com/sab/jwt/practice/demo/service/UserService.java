package com.sab.jwt.practice.demo.service;

import com.sab.jwt.practice.demo.model.AppUser;
import com.sab.jwt.practice.demo.model.Role;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser appUser);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    AppUser getUser(String username);

    List<AppUser> getUsers();
}
