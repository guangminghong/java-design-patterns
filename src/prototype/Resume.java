package prototype;

import java.io.Console;

public class Resume {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume (String name){
		this.name = name;
	}
	//设置个人信息
	public void SetPersonalInfo(String sex,String age){
		this.sex = sex;
		this.age = age;
	}
	
	//设置工作经历
	public void setWorkExprience(String timeArea, String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void Display(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println("工作经历"+timeArea+"--"+timeArea);
	}
}
