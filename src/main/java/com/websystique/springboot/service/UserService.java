package com.websystique.springboot.service;

import com.websystique.springboot.model.User;

import java.util.List;

/**
 * Created by Ext-MayukhG on 7/4/2018.
 */
public interface UserService {
    public List<User> findAllUsers();
    public User findById(Integer id);
    public boolean isUserExist(User user);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUserById(Integer id);
    public void deleteAllUsers();
}
