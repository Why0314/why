package dao.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import pojo.User;
import util.RowMap;
import util.jdbcUtil;

public class UserDaoImple implements UserDaoInter,RowMap<User>{

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return jdbcUtil.executeUpdate("insert into user(login_id,password) values(?,?)",user.getLoginId(),user.getPassword());
	}

	@Override
	public int edit(User user) {
		// TODO Auto-generated method stub
		return jdbcUtil.executeUpdate("update user set login_id=?,password=? where id=?",
				user.getLoginId(),user.getPassword(),user.getId());
	}

	

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return jdbcUtil.queryOne("select id,login_id,password from user where id=?", this, id);
	}

	@Override
	public User getUserByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return jdbcUtil.queryOne("select id,login_id,password from user where login_id=?", this, loginId);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return jdbcUtil.executeUpdate("delete from user where id=?", id);
	}

	@Override
	public User rowMapping(ResultSet rs) {
		// TODO Auto-generated method stub
		User u = new User();
		try {
			u.setId(rs.getInt("id"));
			u.setLoginId(rs.getString("login_id"));
			u.setPassword(rs.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return jdbcUtil.executeQuery("select id,login_id,password from user", this, null);
	}
	
}
