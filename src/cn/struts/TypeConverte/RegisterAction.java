package cn.struts.TypeConverte;

import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String name2;
	private int age2;
	public void validateValidatePractice() {
		System.out.println("validateValidatePractice");
	}

	@Override
	public void validate() {
		System.out.println("validate");
	}

	public String validatePractice(){
		System.out.println("validatePractice");
		return Action.SUCCESS;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	
}
