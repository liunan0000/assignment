import java.util.*;
public class EnglishName {
	public static boolean name(String s){
		String regex="[A-Z][a-z]+\\s[A-Z][a-z]+";
		String regex1="[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z][a-z]+";
		return s.matches(regex)||s.matches(regex);
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������Ӣ����");
		String str=in.nextLine();
		if(name(str)){
			System.out.println("����Ϸ�");
		}else{
			System.out.println("���벻�Ϸ�");
		}
	}
}
