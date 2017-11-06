import java.util.Scanner;
class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String input = sc.nextLine();
		System.out.println("调整后的字符串为:");
		System.out.println(changeFormat(input));
		
	}
	public static String changeFormat(String input) {
		return input.substring(0,1).
                       toUpperCase().concat(input.substring                       (1).toLowerCase());
	}
}