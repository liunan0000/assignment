//��ƽ��ֵ
import java.util.*;
public class AverageScore2{
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

		for(Integer j:scores){
			sum+=j;

		}
		return sum/scores.size();
	}
	public static void main(String[] args){;
	double s=0;
	ArrayList<Integer>scores=new ArrayList<Integer>();
	String num;
	int m=0;
	System.out.println("���ƽ��ֵ�밴-1");
	System.out.println("������ɼ�:");
	do{
		Scanner sca1=new Scanner(System.in);
		num=sca1.next();
		if(isnum(num)){
			System.out.println("�������ֲ���ȷ���벻Ҫ����С��0�ĳɼ�����������ƽ��ֵ������-1");
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