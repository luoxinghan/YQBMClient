package xyz.yqbm.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 连接数据�?
 * @author lxh
 * @date 2018.10.10
 */
public class DBUtil {

	//�?
	private static String driver = "com.mysql.jdbc.Driver";

	//数据库位�?
	private static String url = "jdbc:mysql://localhost:3306/yqbm?Unicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
	/*private static String url = "jdbc:mysql://localhost:3306/yqbm?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";*/
	
	//用户�?
	private static String username = "root";

	//密码
	private static String password = "741067";

	//打开连接
	public static Connection open(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//关闭连接
	public static void close(Connection connection){
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
