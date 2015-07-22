package inter2;
import java.util.*;
import inter1.Man;
public class test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入姓名");
		String name=in.next();
		System.out.println("请输入性别");
		String sex=in.next();
		System.out.println("请输入年龄");
		int age=in.nextInt();
		System.out.println("请输入身高");
		double height=in.nextDouble();
		Man m=new Man( name, age, sex, height);
		m.canMarry();
		m.print();

	}

}
