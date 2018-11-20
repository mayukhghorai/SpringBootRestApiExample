package com.websystique.springboot.service;

import com.websystique.springboot.model.User;
import com.websystique.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ext-MayukhG on 7/4/2018.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public User findById(Integer id) {
        User user = userRepository.findById(id);
        return user;
    }

    @Override
    public boolean isUserExist(User user) {
        return false;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public void deleteAllUsers() {

    }
}
