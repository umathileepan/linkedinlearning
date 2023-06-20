package com.lambdacode.springcrud.service;
import com.lambdacode.springcrud.dto.UserDTO;
import com.lambdacode.springcrud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUsers(Integer id);

    void updateuser(Integer id, User user);

    void deleteuser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
