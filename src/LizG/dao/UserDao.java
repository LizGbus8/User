package LizG.dao;

import LizG.pojo.User;

/**
 * 
*    
* 项目名称：用户登陆   
* 类名称：UserDao   
* 类描述：   用户操作类
* 创建人：LizG   
* 创建时间：2017年3月13日 下午9:39:18   
* @version  V1.0
 */
public interface UserDao {
	/**
	 * 
	 * @param name
	 * 			用户名
	 * @param password
	 * 			用户密码
	 * @return  返回是否登陆成功
	 */
	//login
	public abstract boolean isLogin(String name, String password);
	
	//regist
	public abstract void regist(User user);
}
