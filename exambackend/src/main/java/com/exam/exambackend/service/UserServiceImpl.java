package com.exam.exambackend.service;

import com.exam.exambackend.model.User;
import com.exam.exambackend.model.UserRole;
import com.exam.exambackend.repo.RoleRepository;
import com.exam.exambackend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User exist =this.userRepository.findByUsername(user.getUsername());
        if(exist !=null){

            System.out.println("User is there");
            throw new Exception("User is present");
        }
        else{
                for(UserRole r : userRoles)
                {
                    roleRepository.save(r.getRole());
                }
                user.getUserRoles().addAll(userRoles);
                exist= this.userRepository.save(user);
        }
        return exist;
    }

    @Override
    public User createAdmin(User user, Set<UserRole> userRoles) throws Exception {

        User exist =this.userRepository.findByUsername(user.getUsername());
        if(exist !=null){

            System.out.println("User is there");
            throw new Exception("User is present");
        }
        else{
            for(UserRole r : userRoles)
            {
                roleRepository.save(r.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            exist= this.userRepository.save(user);
        }
        return exist;
    }
}
