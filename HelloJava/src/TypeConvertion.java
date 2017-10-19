

public class TypeConvertion {
	public static void main(String[] args) {
		int intNum = 4;
		float floatNum = 9.5F;
		
		floatNum /= intNum;
		System.out.println("9.5F除以4的商是："+floatNum);
		
		double numX = 4.88;
		double numY = 78.83;
		int numZ = (int)numX+(int)numY;
		System.out.println("4.88和78.83转换成int型相加的和是："+numZ);
		
		char charVar = 'T';
		int intVar = (int)charVar;
		System.out.println("将字符T转换成int型变量是："+intVar);
		int num1 = 34;
		double num2 = (double)num1/3;
		System.out.println("34的三分之一是："+num2);
	}

}
