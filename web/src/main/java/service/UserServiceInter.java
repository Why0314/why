package service;

import java.util.List;

import pojo.User;

public interface UserServiceInter {
	public int add(User user);
	public int edit(User user);
	public int del(int id);
	public User getUserById(int id);
	public User getUserByLoginId(String loginId);
	public List<User> getUsers();
}
