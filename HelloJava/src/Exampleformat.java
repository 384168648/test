import java.util.Date;
import java.util.Locale;
public class Exampleformat {
	public static void main(String[] args) {
		Date today=new Date();
		String a=String.format(Locale.US,"%tb",today);
		String b=String.format(Locale.US,"%tB",today);
		String c=String.format("%ta",today);
		String d=String.format("%tA",today);
		String e=String.format("%tY",today);
		String f=String.format("%ty",today);
		String g=String.format("%tm",today);
		String h=String.format("%td",today);
		String i=String.format("%te",today);
		
		System.out.println("格式化后的字符串为月份的英文缩写："+a);
		System.out.println("格式化后的字符串为月份的英文全写："+b);
		System.out.println("月格式化后的字符串为星期："+c);
		System.out.println("格式化后的字符串为星期："+d);
		System.out.println("格式化后的字符串为4位的年份值："+e);
		System.out.println("格式化后的字符串为2位的年份值："+f);
		System.out.println("格式化后的字符串为2位的月份值："+g);
		System.out.println("格式化后的字符串为2位的日期值："+h);
		System.out.println("格式化后的字符串为1位的日期值："+i);
	}

}
