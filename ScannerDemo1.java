import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î1:");
		String result = sc.next();
		sc.nextLine();
		//String result= sc.nextLine();
		System.out.println("«Î ‰»Î2:");
		String line = sc.nextLine();
		
		System.out.println("result="+result+"line="+line+"...");	
	}
}