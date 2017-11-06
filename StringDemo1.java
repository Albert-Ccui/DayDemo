public class StringDemo1 {
	public static void main(String[] args) {
		String str3="Albert";
		String str2="Albert";
		String str1=new String("Albert");
		String str4=new String("Albert");
		System.out.println(str1==str4);
		System.out.println(str2==str3);
System.out.println(str3==str4);	
	}	
}