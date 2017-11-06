//预定义字符类：\d \D \w \W \s \S .
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class PatternDemo1 {
	public static void main(String[] args) {
		/*String regex = "\\W";
		String past = "1我@#$!%^_&q2爱w3中e4国r5共t6产y7党u8";
		String now = past.replaceAll(regex,"");
		System.out.println(now);*/
		/*String regex = "[^a-z]?";
		String input = "f";
		Pattern p = Pattern.compile(regex);	
		Matcher m = p.matcher(input);
		System.out.println(m.matches());*/
		String str1 = "我。。爱。。。中。国。共。产党";
		String[] arr1 = str1.split("[。]?");
		for(int i=0;i<arr1.length;i++)	 {
			System.out.println(arr1[i]);
		}
	
		
	}
}