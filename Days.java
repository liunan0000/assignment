//判断年份的天数
import java.util.*;
public class Days {
	public static boolean isNumeric(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>57)
				return false;
		}
		return true;
	}
	public static int getDays(int year){
		if(year%4==0&&year%100!=0||year%400!=0){
			return 366;

		}else{
			return 365;
		}
	}			
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("输入年份");
		String answer;
		do{
			String n=in.next();
			isNumeric(n);
			System.out.println(isNumeric(n));
			if(isNumeric(n)==true){
				int m = Integer.parseInt(n);
				getDays(m);
				System.out.println(getDays(m));
			}
			System.out.println("还继续吗？(y/n):");
			answer=in.next();
		}while(answer.equals("y"));
	}
}
