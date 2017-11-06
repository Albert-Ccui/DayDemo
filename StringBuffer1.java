import java.util.Scanner;
class StringBuffer1 {
	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer("abc");
		//sb.insert(3,"helloworld");
		//System.out.println(sb);
		sb.replace(0,1,"hello");
		char c =sb.charAt(4);
		System.out.println(sb);
		System.out.println(c);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符:QAQ");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		StringBuffer sb = new StringBuffer("{");
		for(int i = 0 ;i<ch.length; i++) {
		sb.append(ch[i]).append(",");
		}
		int x = sb.lastIndexOf(",");
		sb.deleteCharAt(x).append("}");
		
	
		System.out.println("格式化后的字符串为:");
		System.out.println(sb);
	
	}
}