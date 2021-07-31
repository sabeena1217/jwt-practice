package com.sab.jwt.practice.demo.service;

import com.sab.jwt.practice.demo.model.AppUser;
import com.sab.jwt.practice.demo.model.Role;
import com.sab.jwt.practice.demo.repo.RoleRepo;
import com.sab.jwt.practice.demo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public AppUser saveUser(AppUser appUser) {
        log.info("Saving new user: {}", appUser.getName());
        return userRepo.save(appUser);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role: {}", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        AppUser appUser = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        appUser.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user {} ", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
