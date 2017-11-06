import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
*����ַ��������еĵ绰����
*/
class PatternDemo2 {
	public static void main(String[] args) {
		String article="��ƪ������һ����3���ֻ���,����ͨ��������ʽ13255425825��ȡ���еĺ��룬���˵ĵ绰��17854235157�������ĵ绰����1234567������18071886288";
		String regex="1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(article);
		while(m.find()) {
		System.out.println(m.group());
		}
		String simplify="���Ұ������������й���������������";
		String regex2 = "(.)\\1+(.)\\2+";
		String result = simplify.replaceAll(regex2,"$1");
		System.out.println(result);
		String word = "��.��.��.��.��.��...��";
		String regex3="\\.";
		String result2= word.replaceAll(regex3,"");
		System.out.println(result2);
	}


}