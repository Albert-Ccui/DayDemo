class StringParam1 {
	public static void main(String[] args) {
		String s = new String("hello");
		System.out.println(s);
		changeString(s);
		System.out.println(s);
		System.out.println("------------");
		StringBuffer sb =new StringBuffer("Hello");	
		System.out.println(sb);
		changeBuffer(sb);
		System.out.println(sb);	
	}
	public static void changeString(String s) {
		s = new String("world");
	}
	public static void changeBuffer(StringBuffer sb) {
		sb = new StringBuffer("world");
	}
}