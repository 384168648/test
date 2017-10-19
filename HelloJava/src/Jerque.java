
public class Jerque {
	public static void main(String[] args) {
		String str="";
		long starTime=System.currentTimeMillis();
		for(long i=0;i<1000000;i++){
			str=str+i;
		}
		long endTime=System.currentTimeMillis();
	long time=endTime-starTime;
	System.out.println("String消耗时间："+time);
	StringBuilder builder=new StringBuilder("");
	starTime=System.currentTimeMillis();
	for(long j=0;j<1000000;j++){
		builder.append(j);
	}
	endTime=System.currentTimeMillis();
	time=endTime-starTime;
	System.out.println("StringBuilder消耗时间："+time);
	}

}
