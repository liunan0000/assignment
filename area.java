import java.util.*;
public class area {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double radius=in.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("圆的面积为："+area);
	}

}
