package com.lambdacode.springcrud.controller;
import com.lambdacode.springcrud.dto.UserDTO;
import com.lambdacode.springcrud.entity.User;
import com.lambdacode.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){

        userService.addUser(user);
        return "Sucess";
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get")
    public User getUser(@RequestParam Integer id){
        return userService.getUsers(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id,@RequestBody User user){
        userService.updateuser(id, user);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        userService.deleteuser(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/update_name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        userService.updateName(id, userDTO);

        return ResponseEntity.noContent().build();
    }
}
