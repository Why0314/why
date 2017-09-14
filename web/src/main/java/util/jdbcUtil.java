package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class jdbcUtil{
	public static Connection getConnection(){
		Connection con =null;
		try {
			Class.forName(DataSource.DRIVER);
			con  = DriverManager.getConnection(DataSource.URL, DataSource.USER, DataSource.PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	public static void closeAll(ResultSet rs,PreparedStatement ps,Connection con){
		try {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int executeUpdate(String sql,Object... obj){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		try {
			ps=con.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1,obj[i]);
				}
			}
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			closeAll(null, ps, con);
		}			
		return result;
	}
	public static <T>List<T> executeQuery(String sql,RowMap<T> row,Object...obj){
		List<T> result = new ArrayList<>();
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps=con.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
			}
			rs=ps.executeQuery();
			while(rs.next()){
				T t = row.rowMapping(rs);
				result.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(rs, ps, con);
		}
		return result;
	}
	public static <T>T queryOne(String sql,RowMap<T> row,Object...obj){
		T t=null;
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps=con.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
			}
			rs=ps.executeQuery();
			if(rs.next()){
				t = row.rowMapping(rs);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(rs, ps, con);
		}
		return t;
	}

	
}
