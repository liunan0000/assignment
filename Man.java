package inter1;

import java.util.Scanner;

public class Man {
	private String name;
	private int age;
	private String sex;
	private double height;
	public Man(String name,int age,String sex,double height){
		this.name=name;
		this.age=age;
		this.height=height;
		this.sex=sex;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public double getHeight() {
		return height;
	}
	public void canMarry(){
		if(sex.equals("m")){
			if(age>20){
				System.out.println("he can marry");
			}
		}if(sex.equals("f")){
			if(age>22){
				System.out.println("she can marry");
			}
		}
	}
	public	void print(){
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSex());
		System.out.println(getHeight());
	}

}