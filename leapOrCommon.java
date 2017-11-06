import java.util.Scanner;
import java.util.Calendar;
class leapOrCommon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������(yyyy):");
		int year = sc.nextInt();
		System.out.println(judgeYear(year));
	}
	private static String judgeYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,2,1);
		cal.add(Calendar.DAY_OF_MONTH,-1);
		int judge_Day = cal.get(Calendar.DAY_OF_MONTH);
		if(judge_Day == 29) {
			return "���ã���������(leap year)...";
		}
		return "���ã�����ƽ��(common year)...";
	}
}
/*
ƽ��:365��
����:366��
*/