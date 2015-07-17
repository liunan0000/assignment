import java.util.*;
public class IdentityCard {
	public static boolean isNumeric(String str){
		for(int i=16;--i>=0;){
			int chr=str.charAt(i);
			int chr1=str.charAt(17);
			if((chr<48 || chr>57)&&(chr1<48||chr1>57||chr1!=88))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的身份证号");
		String id=in.next();
		isNumeric(id);
		System.out.println(isNumeric(id));
		if(isNumeric(id)){
			int[] arr1=new int[17];
			int[] arr={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
			int sum=0;
			for(int i=0;i<id.length()-1;i++){
				arr1[i]=Integer.parseInt(String.valueOf(id.charAt(i)));
				sum=sum+arr1[i]*arr[i];
			}
			int rem=sum%11;
			int ch=id.charAt(18);
			int[] last={49,48,88,57,56,55,54,53,52,51,50};
			if(last[rem]==ch){
				System.out.println("输入的是正确的");
			}else{
				System.out.println("输入的是不符合的");
			}
		}

	}
}
