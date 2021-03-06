package com.rx.powerstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rx.powerstore.entity.User;

@Service
public interface UserService {
	public List<User> findAll();

	public User findByUsername(String username);
	public User findByEmailAddress(String emailAddress);
	
	public void save(User user);

	public User findOne(long id);

	public void delete(User user);
}
