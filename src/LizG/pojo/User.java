package LizG.pojo;
/**
 * 
*    
* 项目名称：用户登陆   
* 类名称：User   
* 类描述：   用户基本描述类
* 创建人：LizG   
* 创建时间：2017年3月13日 下午9:31:32   
* @version  1.0
 */
public class User {
	private String name;//用户名
	private String password;//密码
	
	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
