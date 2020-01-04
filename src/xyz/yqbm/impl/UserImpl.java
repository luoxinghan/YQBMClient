package xyz.yqbm.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import xyz.yqbm.dao.UserDao;
import xyz.yqbm.entity.User;
import xyz.yqbm.util.DBUtil;


public class UserImpl implements UserDao{

	@Override
	public ArrayList<User> findAllUser() {
		String sql = "SELECT * FROM sys_user ORDER BY `order`";
		System.out.println("<<=====" + sql);
		ArrayList<User> userList = new ArrayList<User>();
		Connection connection = DBUtil.open();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()){
				Integer id = rs.getInt(1);
				String userName = rs.getString(2);
				String password = rs.getString(3);
				String roleName = rs.getString(4);
				Byte order = rs.getByte(5);
				
				User user = new User(id, userName, password, roleName, order);
				userList.add(user);
			}
			return userList;
		} catch(Exception e) {
			e.printStackTrace();
			return userList;
		} finally {
			DBUtil.close(connection);
		}
	}
	
	public Integer getBackUserSize(String userName, String telephone) {
		String sql = "SELECT COUNT(*) FROM sys_user;";
		Integer count = 0;
		Connection connection = DBUtil.open();
		try{
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
			}
			return count;
		} catch(Exception e) {
			e.printStackTrace();
			return count;
		} finally {
			DBUtil.close(connection);
		}
	}
	
	@Override
	public Boolean addNewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		String sql = "UPDATE sys_user SET username=?, `password`=?,role_name=?,`order`=? WHERE id=?;";
		Connection connection = DBUtil.open();
		System.out.println("=====>>" + sql);
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, user.getUserName());
			pstm.setString(2, user.getPassword());
			pstm.setString(3, user.getRoleName());
			pstm.setByte(4, user.getOrder());
			pstm.setInt(5, user.getId()); 
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			DBUtil.close(connection);
		}	
	}
	

	@Override
	public User findById(int uId) {
		String sql = "SELECT * FROM sys_user WHERE id = " + uId + ";";
		System.out.println("<<=====" + sql);
		User user = new User();
		Connection connection = DBUtil.open();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()){
				Integer id = rs.getInt(1);
				String userName = rs.getString(2);
				String password = rs.getString(3);
				String roleName = rs.getString(4);
				Byte order = rs.getByte(5);
				
				user = new User(id, userName, password, roleName, order);
			}
			return user;
		} catch(Exception e) {
			e.printStackTrace();
			return user;
		} finally {
			DBUtil.close(connection);
		}
	}
}
