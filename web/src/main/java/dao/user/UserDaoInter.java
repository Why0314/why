package dao.user;

import java.util.List;

import pojo.User;

public interface UserDaoInter {
	public int add(User user);
	public int edit(User user);
	public int del(int id);
	public List<User> getUsers();
	public User getUserById(int id);
	public User getUserByLoginId(String loginId);
}
