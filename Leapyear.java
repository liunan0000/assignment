//ÅÐ¶ÏÊÇ·ñÎªÈòÄê
import java.util.*;
public class Leapyear {
	public static boolean isLeap(int year){
		if(year%4==0&&year%100!=0||year%400!=0){
			return true;

		}else{
			return false;
		}
	}
	public static boolean isNumeric(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>57)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("please input the year");
		String n=in.next();
		isNumeric(n);
		System.out.println(isNumeric(n));
		if(isNumeric(n)==true){
			int year = Integer.parseInt(n);
			if(isLeap(year)){
				System.out.println("this year is leap year");

			}else{
				System.out.println("this year is not leap year");
			}
		}
	}		
}	
