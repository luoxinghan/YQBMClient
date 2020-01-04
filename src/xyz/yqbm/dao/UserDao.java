package xyz.yqbm.dao;

import java.util.ArrayList;

import xyz.yqbm.entity.User;

/**
 * 用户信息
 * @author lxh
 * @date 2018.10.09
 * 
 */
public interface UserDao {
	
	/**
	 * @Title: findAllUser   
	 * @Description: TODO(获取所有的用户)        
	 * @return: ArrayList<User>      
	 * @throws
	 */
	public ArrayList<User> findAllUser();
	
	/**
	 * 添加一个新的用户
	 * @return
	 */
	public Boolean addNewUser();
	
	/**
	 * @Title: getBackUserSize   
	 * @Description: TODO(获取所有用户)   
	 * @param: @param userName
	 * @param: @param telephone
	 * @param: @return      
	 * @return: Integer      
	 * @throws
	 */
	public Integer getBackUserSize(String userName, String telephone);

	/**
	 * 根据用户id删除用户
	 * @param id
	 * @return
	 */
	public Boolean deleteById(int id);
	
	/**
	 * 更改一个用户的所有信息
	 * @param user
	 * @return
	 */
	public Boolean updateUser(User user);
	
	/***
	 * 根据用户Id查找用户
	 * @param id
	 * @return
	 */
	public User findById(int id);
}
