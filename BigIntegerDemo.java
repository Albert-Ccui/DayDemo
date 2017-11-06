import java.math.BigInteger;
class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("6");
		BigInteger[] arr = bi1.divideAndRemainder(bi2);
		for(int i=0;i<arr.length; i ++) {
			System.out.println(arr[i]);
		}
		System.exit(0);
	}
}