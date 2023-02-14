package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.UserDao;
import com.blog.model.User;
import com.blog.payloads.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	@Override
	public UserDto createUser(UserDto userDto) {
	User user=this.dtoToUser(userDto);
	User savedUser=this.dao.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer UserId) {
		User user=this.dao.findById(UserId)
				.orElseThrow(() -> new ResourceNotFoundException("User","id",userId));
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user=this.dao.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}
	
	private User dtoToUser(UserDto userDto)
	{
		User user=new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPasword(userDto.getPasword());
		user.setAbout(userDto.getAbout());
		
		return user;	
	}
	
	public UserDto userToDto(User user)
	{
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPasword(user.getPasword());
		userDto.setAbout(user.getAbout());
		return userDto;
		
	}
}
