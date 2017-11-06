public class IntNull {
	public static void main(String[] args) {
		/*String a = "  ";
		System.out.println(a.isEmpty());
		for(char c=0;c<=9;c++) {
		System.out.println(c);*/

		/*String s= "abcdef";
		byte[] by=s.getBytes();	
		for(int i=0;i<by.length;i++){
		System.out.println(by[i]);
	}*/
		char[] arr = {'a','b','v'};
		char[] arr1= {'3','2','1'};
		String a=String.valueOf(arr);
		System.out.println(a);
		String str=a.valueOf(arr1);
		System.out.println(str);
	}
}