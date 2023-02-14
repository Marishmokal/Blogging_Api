package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
