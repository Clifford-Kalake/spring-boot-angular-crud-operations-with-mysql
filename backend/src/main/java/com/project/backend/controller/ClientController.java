package com.project.backend.controller;

import com.project.backend.model.User;
import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ClientController {
    @Autowired
    private UserService userService;

    //Hello world
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    /*
    * Rest API CRUD
    * Create User - POST
    * Read User - GET
    * Delete User - DELETE
    * Update User - PUT
    */

    //Create User
    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }

    //Read Users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //Update user by Id
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user, @PathVariable("id") long id){
        return userService.updateUser(user, id);
    }

    //Delete User by Id
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "User deleted successfully...";
    }

    //Get User by Id
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }
}
