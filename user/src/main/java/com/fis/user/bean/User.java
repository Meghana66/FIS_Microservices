//package com.fis.springlearn.bean;
package com.fis.user.bean;

//import java.util.Set;

//import org.springframework.context.support.BeanDefinitionDsl.Role;


public class User {

	
	private int id;

	
	private String username;

	//@Column(name = "us_password")
	private String password;

	//@ManyToMany(mappedBy = "userList", fetch = FetchType.EAGER)
	//private Set<Role> roleList;
	public User() {
		
	}
	public User(int id,String username,String password) {
		super();
		this.id=id;
		this.username=username;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}


