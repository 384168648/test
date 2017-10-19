
public class SubD {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("StringBuilder");
		StringBuilder s1=builder.delete(5, 5);
		System.out.println("删除指定字符串后：s1="+s1);
		StringBuilder s2=builder.delete(5, 10);
		System.out.println("删除指定字符串后：s2="+s2);
	}

}
