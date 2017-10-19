
public class ContinueDemo {
	public static void main(String[] args) {
		int i=0;
		System.out.println("十以内的全部奇数是：");
		while(i<10){
			i++;
			if(i%2==0){
				continue;
			}
			System.out.print(i+"  ");
		}
	}

}
