package sk.service;

import java.util.List;

import sk.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public List<User> getAll();
}
