package LizG.test;

import java.util.Scanner;

import LizG.dao.UserDao;
import LizG.dao.impl.UserDaoImpl;
import LizG.pojo.User;

/**
 * 
*    
* ��Ŀ���ƣ��û���½   
* �����ƣ�UserDemo   
* ��������   User������
* �����ˣ�LizG   
* ����ʱ�䣺2017��3��13�� ����10:01:48   
* @version V1.0
 */
public class UserDemo {

	public static void main(String[] args) {
		User u = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("ע���������û���������");
		String name = input.nextLine();
		String password = input.nextLine();
		u.setName(name);
		u.setPassword(password);
		UserDao ud = new UserDaoImpl();
		ud.regist(u);
		System.out.println("��½����");
		String name1 = input.nextLine();
		String password1 = input.nextLine();
		System.out.println(ud.isLogin(name1, password1));
	}

}
