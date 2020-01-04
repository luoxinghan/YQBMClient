package xyz.yqbm.entity;

/**
 * @describe 用户表对应的用户实体
 * @author luoxinghan
 * @date 2019/12/29
 * @version 1.0
 */
public class User {

	/** user id */
	private Integer id;
	
	private String userName;
	
	private String password;
	
	private String roleName;
	
	private Byte order;

	public User() {
		super();
	}

	public User(Integer id, String userName, String password, String roleName, Byte order) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.roleName = roleName;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Byte getOrder() {
		return order;
	}

	public void setOrder(Byte order) {
		this.order = order;
	}
}
