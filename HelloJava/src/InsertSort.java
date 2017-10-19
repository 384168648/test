
public class InsertSort {
	public static void main(String[] args) {
		int[] array=new int[]{20,40,90,30,80,70,50};
		System.out.println("排序前：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		int tmp;
		int j;
		for(int i=1;i<array.length;i++){
			tmp=array[i];
			for(j=i-1;j >= 0 && array[j]>tmp;j--){
				array[j+1]=array[j];
			}
			array[j+1]=tmp;
		}
		System.out.println("\n排序后：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

}
