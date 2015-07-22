package inter1;
public class Rectangle {
	private String color;
	private double length;
	private double wide;
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
