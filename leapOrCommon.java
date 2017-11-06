import java.util.Scanner;
import java.util.Calendar;
class leapOrCommon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份(yyyy):");
		int year = sc.nextInt();
		System.out.println(judgeYear(year));
	}
	private static String judgeYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,2,1);
		cal.add(Calendar.DAY_OF_MONTH,-1);
		int judge_Day = cal.get(Calendar.DAY_OF_MONTH);
		if(judge_Day == 29) {
			return "您好，这是闰年(leap year)...";
		}
		return "您好，这是平年(common year)...";
	}
}
/*
平年:365天
闰年:366天
*/