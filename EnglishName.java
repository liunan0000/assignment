import java.util.*;
public class EnglishName {
	public static boolean name(String s){
		String regex="[A-Z][a-z]+\\s[A-Z][a-z]+";
		String regex1="[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z][a-z]+";
		return s.matches(regex)||s.matches(regex);
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入英文名");
		String str=in.nextLine();
		if(name(str)){
			System.out.println("输入合法");
		}else{
			System.out.println("输入不合法");
		}
	}
}
