package com.lambdacode.springcrud.service.Impl;

import com.lambdacode.springcrud.dto.UserDTO;
import com.lambdacode.springcrud.entity.User;
import com.lambdacode.springcrud.repository.UserRepository;
import com.lambdacode.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUsers(Integer id) {
        String io;
        User user = userRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid user id"+id));
        return user;
    }

    @Override
    public void updateuser(Integer id, User user) {
        userRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid user id" + id));

        user.setId(id);
        userRepository.save(user);
    }

    @Override
    public void deleteuser(Integer id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid user id" + id));
        userRepository.delete(user);
    }

    @Override
    public void updateName(Integer id, UserDTO userDTO) {
        User user = userRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid user id" + id));
        user.setName(userDTO.getName());

        userRepository.save(user);
    }
}
