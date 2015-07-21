import java.util.Scanner;
public class Email {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入Email：");
		String str=in.next();
		String regex="[a-zA-z0-9_]{6,15}@[a-zA-Z0-9]{2,5}\\.[a-zA-Z0-9]{2,3}";
		boolean b=(str.matches(regex));
		if(b){
			System.out.println("输入合法");
		}else{
			System.out.println("输入不合法");
		}
	}

}
