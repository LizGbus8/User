package LizG.dao.impl;

import java.util.ArrayList;

import LizG.dao.UserDao;
import LizG.pojo.User;
/**
 * 
*    
* ��Ŀ���ƣ��û���½   
* �����ƣ�UserDaoImpl   
* ��������   �û�������ʵ����
* �����ˣ�LizG   
* ����ʱ�䣺2017��3��13�� ����9:43:00   
* @version V1.0
 */
public class UserDaoImpl implements UserDao {

	
	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	//private ���ñ��˷���
	//static �����ж����ó�Ա����
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
