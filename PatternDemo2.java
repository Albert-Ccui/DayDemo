import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
*获得字符串中所有的电话号码
*/
class PatternDemo2 {
	public static void main(String[] args) {
		String article="这篇文章中一共有3个手机号,可以通过正则表达式13255425825获取所有的号码，大兴的电话是17854235157，标量的电话不是1234567，而是18071886288";
		String regex="1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(article);
		while(m.find()) {
		System.out.println(m.group());
		}
		String simplify="我我爱爱爱中中中中国国共共共产党党";
		String regex2 = "(.)\\1+(.)\\2+";
		String result = simplify.replaceAll(regex2,"$1");
		System.out.println(result);
		String word = "我.爱.中.国.共.产...党";
		String regex3="\\.";
		String result2= word.replaceAll(regex3,"");
		System.out.println(result2);
	}


}