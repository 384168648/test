
public class SubO {

	public static void main(String[] args) {
		String s1="int";
		String s2="ser";
		StringBuilder builder=new StringBuilder(s1);
		builder.insert(2,s2);
		System.out.println("追加后builder的值是："+builder);
	}

}
