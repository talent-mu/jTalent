package sk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sk.dao.UserMapper;
import sk.model.User;
@Service("userService")
public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	
	

	public UserMapper getUserMapper() {
		return userMapper;
	}


	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}


	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}



}
