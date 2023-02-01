package com.exam.exambackend.service;

import com.exam.exambackend.model.User;
import com.exam.exambackend.model.UserRole;

import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User createAdmin(User user, Set<UserRole> userRoles) throws Exception;
}
