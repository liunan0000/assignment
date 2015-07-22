package inter1;

import java.util.ArrayList;

public class Student {
	private String name;
	private String major;
	private int grade;
	private ArrayList<Integer>cet4_scores=new ArrayList<Integer>();
	public Student(String name,String major,int grade,ArrayList cet4_scores ){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.cet4_scores=cet4_scores;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public int getGrade() {
		return grade;
	}
	public ArrayList  getCet4_scores() {
		return cet4_scores;
	}
	public void lecel_up(){
		grade++;
	}
	 public boolean passed_cet4(){
		 int i=0;
		 while(i<=cet4_scores.size()){
			 i++;	 
			 if(cet4_scores.get(i)>425){
				 break;
			 }
		 }
		return true;
	}
	 public void printInfo(){
		 System.out.println(getName());
		 if(getGrade()==4){
			 System.out.println("毕业了");
		 }else
			 System.out.println("大学"+getGrade()+"年级了");
		 if(passed_cet4()){
			 System.out.println("四级通过了");
		 }else{
			 System.out.println("四级没通过");
		 }
		 System.out.println(getMajor());
	 }
}
