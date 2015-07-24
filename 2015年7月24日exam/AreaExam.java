/*�����Ǹ�3���С���ѣ�����һЩ��ͬ��״�Ļ�ľ��
��״���������Σ������Σ�Բ�Σ����������֡�ĳ�죬���콫�Լ��Ļ�ľ�õ������ǰ��
�������������Щ��ľ�����������Ϊ�����������������أ�
 */
import java.util.ArrayList;
abstract class Shape1{

	abstract double Area();
}
class Rect1 extends Shape1{
	double lenght;
	double wide;
	Rect1(double lenght,double wide){
		this.lenght=lenght;
		this.wide=wide;
	}
	double Area(){
		return lenght*wide;

	}
} 
class Squ extends Shape1{
	double side;
	Squ(double side){
		this.side=side;
	}
	double Area(){
		return side*side;
	}
} 
class Cir1 extends Shape1{
	double R;
	Cir1(double R){
		this.R=R;
	}
	double Area(){
		return 3.14*R*R;
	}
}
class Tri extends Shape1{
	double wide1;
	double high;
	Tri(double wide1,double high){
		this.high=high;
		this.wide1=wide1;
	}
	double Area(){
		return 0.5*wide1*high;
	}
}


public class AreaExam {
	public static void main(String[] args){
		ArrayList<Shape1> shapes = new ArrayList<Shape1>();
		shapes.add(new Rect1(20,10));
		shapes.add(new Squ(15));
		shapes.add(new Cir1(10));
		shapes.add(new Tri(20,14));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
	public static double  getTotalArea(ArrayList<Shape1> shapes){
		double totalarea=0;
		for(int i=0;i<shapes.size();i++){
			totalarea+=shapes.get(i).Area();
		}
		return totalarea;
	}

}

