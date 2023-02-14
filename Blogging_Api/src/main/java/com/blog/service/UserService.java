package com.blog.service;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {


	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto user,Integer UserId);
	UserDto getUserById(Integer userId);
	List<UserDto>getAllUsers();
	void deleteUser(Integer userId);

}
