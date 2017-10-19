
public class Judge {
	public static void main(String[] args) {
		String regex="\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
		String str1="aaa@";
		String str2="aaaa";
		String str3="aaaaa@111.com";
		  if(str1.matches(regex)){
			  System.out.println(str1+"是一个E_mail地址格式");
		  }
		  if(str2.matches(regex)){
			  System.out.println(str2+"是一个E_mail地址格式 ");
		  }
		  if(str3.matches(regex)){
			  System.out.println(str3+"是一个E_mail地址格式 ");
		  }
		  else{
			  System.out.println("都不是E_mail地址格式");
		  }
	}

}
