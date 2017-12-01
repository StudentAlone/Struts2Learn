package cn.struts.web;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class intercepterActionExtends extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		HttpServletRequest request=(HttpServletRequest) invocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
		String name=request.getParameter("username");
		System.out.println(name);
		if(!"laoyin".equals(name)){
			return Action.INPUT;
		}
		
		return invocation.invoke();
	}



}
