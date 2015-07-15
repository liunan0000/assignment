//折中法猜数字
import java.util.*;
public class GN {

	public static int guess(int x){
		int time=0;
		int max=100;
		int min=0;
		int y=(max+min)/2;
		while(min<max&&y!=x){
			if(y>x){
				max=y+1;
			}else{
				min=y-1;
			}
			time=time+1;
			y=(max+min)/2;
		}
		return time+1;
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
		System.out.println("请输入0--100的一个整数");
		String n=in.next();
		isNumeric(n);
		System.out.println(isNumeric(n));
		if(isNumeric(n)==true){
			int m = Integer.parseInt(n);
			guess(m);
			System.out.println("执行次数为"+guess(m));
		}
	}
}
