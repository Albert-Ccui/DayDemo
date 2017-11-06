import java.math.BigDecimal;
import java.util.Date;
class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = BigDecimal.valueOf(2);
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.divide(bd2));
		System.out.println(bd1);
		System.out.println(bd2);
		Date date = new Date(1000);
		System.out.println(date);
		System.out.println(date.getTime());
System.out.println(date.getMonth());
System.out.println(date.getSeconds());
		Date date1 = new Date();
		System.out.println(date1);
			}

}