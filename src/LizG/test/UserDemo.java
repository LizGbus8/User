package LizG.test;

import java.util.Scanner;

import LizG.dao.UserDao;
import LizG.dao.impl.UserDaoImpl;
import LizG.pojo.User;

/**
 * 
*    
* 项目名称：用户登陆   
* 类名称：UserDemo   
* 类描述：   User测试类
* 创建人：LizG   
* 创建时间：2017年3月13日 下午10:01:48   
* @version V1.0
 */
public class UserDemo {

	public static void main(String[] args) {
		User u = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("注册请输入用户名与密码");
		String name = input.nextLine();
		String password = input.nextLine();
		u.setName(name);
		u.setPassword(password);
		UserDao ud = new UserDaoImpl();
		ud.regist(u);
		System.out.println("登陆输入");
		String name1 = input.nextLine();
		String password1 = input.nextLine();
		System.out.println(ud.isLogin(name1, password1));
	}

}
