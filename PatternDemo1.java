//Ԥ�����ַ��ࣺ\d \D \w \W \s \S .
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class PatternDemo1 {
	public static void main(String[] args) {
		/*String regex = "\\W";
		String past = "1��@#$!%^_&q2��w3��e4��r5��t6��y7��u8";
		String now = past.replaceAll(regex,"");
		System.out.println(now);*/
		/*String regex = "[^a-z]?";
		String input = "f";
		Pattern p = Pattern.compile(regex);	
		Matcher m = p.matcher(input);
		System.out.println(m.matches());*/
		String str1 = "�ҡ������������С�������������";
		String[] arr1 = str1.split("[��]?");
		for(int i=0;i<arr1.length;i++)	 {
			System.out.println(arr1[i]);
		}
	
		
	}
}