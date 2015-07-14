import java.util.*;
class Fibonacc1 {
	public static int Fib(int n){
		if(n<1){
			return 0;
		}
		if(n==1||n==2){
			return 1;
		}else{
			return Fib(n-1)+Fib(n-2);
		} 
	}
}
public class Fibonacc{	
	public static void main(String[] args){
		Fibonacc1 num=new Fibonacc1();
		Scanner in=new Scanner(System.in);
		System.out.println("ÇëÊäÈënµÄÊý");
		int n=in.nextInt();
		int[] fin=new int[n+1];
		for(int i=0;i<n+1;i++){
			fin[i]=num.Fib(i);
			System.out.println(fin[i]);
		}
	}
}
		
