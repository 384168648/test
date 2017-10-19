
public class Cycle {

	public static void main(String[] args) {
		int a = 100;
		while (a == 60) {
			System.out.println("ok! a==60");
			a--;
		}
		int b = 100;
		do {
			System.out.println("ok! b==100");
			b--;
		} while (b == 60);
	}

}
