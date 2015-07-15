//求平均值
import java.util.ArrayList;
import java.util.Scanner;
public class AverageScore3{
	public static boolean isnum(String m){
		try{
			int intnum=Integer.parseInt(m);
			if(intnum<-1){
				return true;
			}else
				return false;
		}catch(Exception e){
			return true;
		}
	}

	public static double averageScore(ArrayList<Integer>scores){
		double sum=0;
		int i=0;
		while(i<scores.size()){
			sum=sum+scores.get(i);
			i++;
		}

		return sum/scores.size();
	}
	public static void main(String[] args){;
	double s=0;
	ArrayList<Integer>scores=new ArrayList<Integer>();
	String num;
	int m=0;
	System.out.println("输出平均值请按-1");
	System.out.println("请输入成绩:");
	do{
		Scanner sca1=new Scanner(System.in);
		num=sca1.next();
		if(isnum(num)){
			System.out.println("输入数字不正确，如果想输出平均值请输入-1");
			continue;
		}
		else{
			m=Integer.parseInt(num);
			scores.add(m);
			if(m==-1){
				System.out.println(s);
			}else
				s=averageScore(scores);
		}
	}while(m!=-1);
	}

}
