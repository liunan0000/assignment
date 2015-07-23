abstract class Shape{
	double s;
	abstract double area();
}
class Cir extends Shape{
	double R;
	Cir(double R){
		this.R=R;
	}
	double area(){
		s=3.14*R*R;
		return s;
	}
}
class Rect extends Shape{
	double wide=3;
	double length=4;
	double area(){
		s=wide*length;
		return s;
	}
}

public class Area1 {
	public static void main(String[] args){
		Shape a=new Cir(3);
		System.out.println(a.area());
		Shape b=new Rect();
		System.out.println(b.area());
	}
}
