import java.util.Scanner;
class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String input = sc.nextLine();
		System.out.println("��������ַ���Ϊ:");
		System.out.println(changeFormat(input));
		
	}
	public static String changeFormat(String input) {
		return input.substring(0,1).
                       toUpperCase().concat(input.substring                       (1).toLowerCase());
	}
}