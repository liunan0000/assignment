package inter2;
import java.util.*;
import inter1.Man;
public class test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("����������");
		String name=in.next();
		System.out.println("�������Ա�");
		String sex=in.next();
		System.out.println("����������");
		int age=in.nextInt();
		System.out.println("���������");
		double height=in.nextDouble();
		Man m=new Man( name, age, sex, height);
		m.canMarry();
		m.print();

	}

}
