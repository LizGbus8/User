package LizG.dao.impl;

import java.util.ArrayList;

import LizG.dao.UserDao;
import LizG.pojo.User;
/**
 * 
*    
* 项目名称：用户登陆   
* 类名称：UserDaoImpl   
* 类描述：   用户操作类实现类
* 创建人：LizG   
* 创建时间：2017年3月13日 下午9:43:00   
* @version V1.0
 */
public class UserDaoImpl implements UserDao {

	
	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	//private 不让别人访问
	//static 让所有对象共用成员变量
	private static ArrayList<User> list = new ArrayList<User>();
	@Override
	public boolean isLogin(String name, String password) {
		boolean flag = false;
		for(User u : list ) {
			if(u.getName().equals(name) && u.getPassword().equals(password)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		list.add(user);
	}

}
