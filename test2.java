package inter2;
import inter1.Student;
import java.util.*;
public class test2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入姓名");
		String name=in.next();
		System.out.println("请输入专业");
		String major=in.next();
		System.out.println("请输入年级：1 大学1年级； 2 大学2年级； 3 大学3年级； 4 大学4年级");
		int grade=in.nextInt();
		ArrayList<Integer>cet4_scores=new ArrayList<Integer>();
		while(true){
			System.out.println("请输入cet_4的成绩,输入结束1000输入");
			int n=in.nextInt();
			if(n==1000){
				break;
			}
			cet4_scores.add(n);
		}
		
		Student s=new Student( name, major, grade,cet4_scores);
		s.lecel_up();
		s.printInfo();
		
	}
}
