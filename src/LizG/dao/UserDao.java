package LizG.dao;

import LizG.pojo.User;

/**
 * 
*    
* ��Ŀ���ƣ��û���½   
* �����ƣ�UserDao   
* ��������   �û�������
* �����ˣ�LizG   
* ����ʱ�䣺2017��3��13�� ����9:39:18   
* @version  V1.0
 */
public interface UserDao {
	/**
	 * 
	 * @param name
	 * 			�û���
	 * @param password
	 * 			�û�����
	 * @return  �����Ƿ��½�ɹ�
	 */
	//login
	public abstract boolean isLogin(String name, String password);
	
	//regist
	public abstract void regist(User user);
}
