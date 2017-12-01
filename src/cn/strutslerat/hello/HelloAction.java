package cn.strutslerat.hello;

public class HelloAction {
	private String name;
	private String pwd;
	
	
    public String execute(){
		 System.out.println("execute  hellow struts");
		 if("laoyin".equals(name)&&"123".equals(pwd)){
			 return "success";
		 }else{
			 System.out.println(name+":"+pwd);
			 return "failed";
		 }
     }
    public String update(){
    	System.out.println("update!"+name);
    	return "update";
    }
    public String logout(){
    	System.out.println("logout!"+name);
    	return "logout";
    }
    public String defaultClass(){
    	System.out.println("defaultClass!"+name);
    	return "success";
    }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
