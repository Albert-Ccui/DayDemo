class BigCutSmall {
	public static void main(String[] args) {
		String big="do you like me ? I wil give every mi fan a free me band . like me or like he";
		String small="like";
		int count  = 0;
		int index = 0;
	while((index=big.indexOf(small))!=-1) {
		count ++ ;
		big = big.substring(index + small.length());
	}	
		System.out.println(count);
	}
}abcdefgsfg