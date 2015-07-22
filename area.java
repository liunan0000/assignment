import java.util.*;
class Rectangle{
	private String color;
	private double length;
	private double wide;
	public Rectangle(){
		
	}
	public Rectangle(String color){
		this.color=color;
	}
	public Rectangle(double length,double wide){
		this.length=length;
		this.wide=wide;
	}
	public Rectangle(String color,double length,double wide){
		this.length=length;
		this.wide=wide;
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public double getLength() {
		return length;
	}
	public double getWide() {
		return wide;
	}
	public double getArea(){
		return length*wide;
	}
	public void printInfo(){
		System.out.println(getColor());
		System.out.println(getWide());
		System.out.println(getLength());
		System.out.println(getArea());
	}
}
class Square{
	private String color;
	private double side;
	public Square(){
		
	}
	public Square(String color){
		this.color=color;
	}
	public Square(String color,double side){
		this.side=side;
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public double getSide() {
		return side;
	}
	public double getArea(){
		return side*side;
	}
	public void printInfo(){
		System.out.println(getSide());
		System.out.println(getColor());
		System.out.println(getArea());
	}
}

public class Area {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("输入长");
		double length=in.nextDouble();
		System.out.println("输入宽");
		double wide=in.nextDouble();
		System.out.println("输入颜色");
		String color=in.next();
		System.out.println("输入边长");
		double side=in.nextDouble();
		Rectangle m=new Rectangle();
		m.getArea();
		m.printInfo();
		Rectangle n=new Rectangle(color);
		n.getArea();
		n.printInfo();
		Rectangle p=new Rectangle(length,wide);
		p.getArea();
		p.printInfo();
		Rectangle q=new Rectangle(color,length,wide);
		q.getArea();
		q.printInfo();
		Square a=new Square();
		a.getArea();
		a.printInfo();
		Square b=new Square(color);
		b.getArea();
		b.printInfo();
		Square c=new Square(color,side);
		c.getArea();
		c.printInfo();
		
	}
}
