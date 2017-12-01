package cn.strutslerat.actionImp;

import cn.strutslerat.bean.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PojoAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private User user;
	public String execute() throws Exception {
		System.out.println("execute£º"+user.getEmail());
		return "success";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
     
}
