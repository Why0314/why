package service;

import java.util.List;

import dao.user.UserDaoImple;
import dao.user.UserDaoInter;
import pojo.User;

public class UserServiceImple implements UserServiceInter{
	UserDaoInter dao = new UserDaoImple();
	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	@Override
	public int edit(User user) {
		// TODO Auto-generated method stub
		return dao.edit(user);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	@Override
	public User getUserByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return dao.getUserByLoginId(loginId);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}

}
