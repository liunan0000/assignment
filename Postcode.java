import java.util.*;
public class Postcode {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�������������룺");
		String str=in.next();
		String regex="[0-9]{6}";
		boolean b=str.matches(regex);
		if(b){
			System.out.println("����Ϸ�");
		}else{
			System.out.println("���벻�Ϸ�");
		}
	}

}
