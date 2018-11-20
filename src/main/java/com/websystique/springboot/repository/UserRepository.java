package com.websystique.springboot.repository;

import com.websystique.springboot.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ext-MayukhG on 7/4/2018.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
//    List<User> findAllUsers();
    User findById(Integer id);
//    boolean isUserExist(User user);
//    void saveUser(User user);
//    void updateUser(User user);
//    void deleteUserById(Integer id);
//    void deleteAllUsers();

}
