
import java.util.Scanner;
public class Volume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入球形的半径：");
		double r = scan.nextDouble();
		final double PI = 3.1415926;
		double volume =4.0/3.0*PI*r*r*r;
		System.out.println("球形的半径是："+r);
		System.out.println("圆周率是:"+PI);
		System.out.println("球形的体积是："+ volume);
	}

}
