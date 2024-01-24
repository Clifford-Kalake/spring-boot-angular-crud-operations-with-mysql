package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //Create user
    User createUser(User user);

    //Read users
    public List<User> getUsers();

    //Read user by Id
    public User getUserById(long id);

    //Delete user by Id
    public void deleteUser(long id);

    //Update user by Id
    public User updateUser(User user, long id);
}
