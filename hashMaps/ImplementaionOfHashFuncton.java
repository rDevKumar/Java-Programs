package hashMaps;

public class ImplementaionOfHashFuncton {

	public static void main(String[] args) {
		System.out.println(HashFunction.getHash("CAT", 5));
		System.out.println(HashFunction.getHash("DOG", 5));
		System.out.println(HashFunction.getHash("BALL", 5));
		System.out.println(HashFunction.getHash("GOD", 5));

	}

}

class HashFunction{
	public static int getHash(String s, int n) {
		int hash = 0;
		for(int i = 0; i < s.length();i ++) {
//			hash += s.charAt(i)%5;
			hash +=((s.charAt(i)%n)*((int)Math.pow(31, n-i)%n))%n;
		}
		return hash;
	}
}
