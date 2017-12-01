package cn.struts.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TestInterceptorLoginAction extends ActionSupport{
	
	/**
	 * test Interceptor
	 */
	private static final long serialVersionUID = 1L;
	private String name ;

	public String login() {
		
		System.out.println("Interceptor success!");
		
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
