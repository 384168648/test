
public class Decision {

	public static void main(String[] args) {
		String s1="Mrkj007";
		String s2="mrkj007";
		
		boolean bn1=s1.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
		boolean bn2=s2.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
		System.out.println(s1+"是合法的数据吗？"+bn1);
		System.out.println(s2+"是合法的数据吗？"+bn2);
	}

}
