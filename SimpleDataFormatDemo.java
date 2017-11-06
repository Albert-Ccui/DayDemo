import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class SimpleDataFormatDemo {
	public static void main(String[] args) throws ParseException {
		String date1 = "1997/08/10 12:30:30";
		String date2 = "2017/10/27 17:30:20";
		String pattern = "yyyy/MM/dd HH:mm:ss";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	         Date d1 =  sdf.parse(date1);
		 Date d2 =  sdf.parse(date2);
		long timeAll = d2.getTime() - d1.getTime();
		long dayAll = timeAll/1000/60/60/24;
		System.out.println(dayAll/365);
	}
}