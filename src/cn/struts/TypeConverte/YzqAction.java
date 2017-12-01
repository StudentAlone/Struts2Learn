package cn.struts.TypeConverte;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class YzqAction extends ActionSupport{
   private String name ;
   private String age;
   
   public String yzqMethod() {
	   System.out.println("yzqMethod:"+name+"--"+age);
	   return Action.SUCCESS;
   }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	   
	
}
