
import java.util.Arrays;
public class Displace {
	public static void main(String[] args) {
		int arr[]=new int[]{45,12,2,10,1};
		Arrays.fill(arr,1,3,8);
		for(int i=0;i<arr.length;i++){
			System.out.println("�?"+i+"个元素是�?"+arr[i]);
		}
	}

}
