
public class CharacterUnicode {

	public static void main(String[] args) {
		String text="明日soft";
		char[] charArray=text.toCharArray();
		StringBuilder builder=new StringBuilder();
		for(char c:charArray){
			builder.append((int)c+" ");
		}
		System.out.println("“明日soft”的Unicode码是：");
		System.out.println(builder.toString());
	}

}
