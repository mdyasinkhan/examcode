package com.exam.exambackend.controller;


import com.exam.exambackend.model.Role;
import com.exam.exambackend.model.User;
import com.exam.exambackend.model.UserRole;
import com.exam.exambackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/student")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();
        Role role= new Role();
        role.setRoleId(01L);
        role.setRoleName("STUDENT");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user,roles);
    }


    @PostMapping("/admin")
    public User createAdmin(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();
        Role role= new Role();
        role.setRoleId(02L);
        role.setRoleName("EXAMINER");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user,roles);
    }
}
