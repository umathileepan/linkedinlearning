package com.lambdacode.springcrud.repository;

import com.lambdacode.springcrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
