package xyz.yqbm.util;

import java.io.File;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

/**
 * @author lxh
 *
 */
public class StringUtil {

	private static Random random = new Random();
	private static final int DEFAULT_MAX_NUM = 100;

	/**
	 * 生成当前纳秒值的字符
	 */
	public static String createTimestamp() {
		return String.valueOf(System.nanoTime()).concat(String.valueOf(random.nextInt(DEFAULT_MAX_NUM)));
	}

	/**
	 * 判断是否为null 是则返回空字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String emptyOrNull(String str) {
		if (str == null) {
			return "";
		} else {
			return str;
		}
	}

	public static Boolean isEmpty(String str) {
		if (str == null || str.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	
	/**
	 * 判断是否为null 是则返回/
	 * 
	 * @param str
	 * @return
	 */
	public static String emptyGetItalic(String str) {
		if (str == null) {
			return "/";
		} else {
			return str;
		}
	}

	/**
	 * 获取code增加�?的字符串
	 * 
	 * @param code
	 * @return
	 */
	public static String addANumberByString(String code) {
		String result = "";
		// 保留code的位�?
		result = String.format("%0" + code.length() + "d", Integer.parseInt(code) + 1);
		return result;
	}

	/**
	 * @Method: makeFileName
	 * @Description: 生成上传文件的文件名，文件名以：uuid+"_"+文件的原始名�?
	 * @Anthor:孤傲苍狼
	 * @param filename 文件的原始名�?
	 * @return uuid+"_"+文件的原始名�?
	 */
	public static String makeFileName(String filename) { // 2.jpg
		// 为防止文件覆盖的现象发生，要为上传文件产生一个唯�?的文件名
		return UUID.randomUUID().toString() + "_" + filename;
	}

	/**
	 * 为防止一个目录下面出现太多文件，要使用hash算法打散存储
	 * 
	 * @Method: makePath
	 * @Description:
	 * @Anthor:孤傲苍狼
	 *
	 * @param filename 文件名，要根据文件名生成存储目录
	 * @param savePath 文件存储路径
	 * @return 新的存储目录
	 */
	public static String makePath(String filename, String savePath) {
		// 构�?�新的保存目�?
		//String dir = savePath + "\\" + dir1 + "\\" + dir2; // upload\2\3 upload\3\5
		String dir = savePath + getYearMonthDay();
		// File既可以代表文件也可以代表目录
		File file = new File(dir);
		// 如果目录不存�?
		if (!file.exists()) {
			// 创建目录
			file.mkdirs();
		}
		return dir;
	}
	
	public static String getTheProcessedPath(String path) {
		path = path.replaceAll("/", "\\\\");
		path = path.replaceAll( "\\\\ ",   "\\\\\\\\ ");
		return path;
	}
	
	public static String changeTheUrl(String path) {
		path = path.replaceAll("\\\\", "/");
		return path;
	}
	
	public static String getYearMonthDay() {
		Calendar calendar = Calendar.getInstance();
		return "//" + calendar.get(Calendar.YEAR) + "//" + (calendar.get(Calendar.MONTH) + 1) + "//"
				+ calendar.get(Calendar.DATE);
	}
	
	/**
	 * 返回�?个字符串子字符串的后面的字符
	 * @Title: getAfterString   
	 * @Description: TODO(这里用一句话描述这个方法的作�?)   
	 * @param str
	 * @param substr 
	 * @return: String      
	 * @throws
	 */
	public static String getAfterString(String str, String substr) {
		return str.substring(str.lastIndexOf(substr) + substr.length());
	}
}
