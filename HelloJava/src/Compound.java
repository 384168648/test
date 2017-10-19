
public class Compound {
	public static void main(String[] args) {
		{
			int y = 40;
			System.out.println("输出y的值："+y);
			int z = 245;
			boolean b;
			{
				b = y > z;
				System.out.println("y>z 成立吗: "+b);
			}
		}
        String word = "hello java";
        System.out.println("输出字符串: "+word);
       
	}

}
