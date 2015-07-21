import java.util.*;
public class Postcode {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入邮政编码：");
		String str=in.next();
		String regex="[0-9]{6}";
		boolean b=str.matches(regex);
		if(b){
			System.out.println("输入合法");
		}else{
			System.out.println("输入不合法");
		}
	}

}
