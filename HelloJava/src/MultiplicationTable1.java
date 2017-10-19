
public class MultiplicationTable1 {
	public static void main(String[] args) {
		int sum=0;
		String flag="从1到100之间的连续整数的和是：";
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>1000){
				flag="从1到"+i+"之间的连续整数的和是：";
				break;
			}
		}
		System.out.println(flag+sum);
	}

}
