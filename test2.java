package inter2;
import inter1.Student;
import java.util.*;
public class test2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("����������");
		String name=in.next();
		System.out.println("������רҵ");
		String major=in.next();
		System.out.println("�������꼶��1 ��ѧ1�꼶�� 2 ��ѧ2�꼶�� 3 ��ѧ3�꼶�� 4 ��ѧ4�꼶");
		int grade=in.nextInt();
		ArrayList<Integer>cet4_scores=new ArrayList<Integer>();
		while(true){
			System.out.println("������cet_4�ĳɼ�,�������1000����");
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
