import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean bool = sc.hasNextInt();
		System.out.println(bool);
		sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println("就我一句话");
	}
}