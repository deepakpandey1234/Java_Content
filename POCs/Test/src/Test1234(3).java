
public class Test1234 {
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        System.out.println(str.substring(0, i) + str.substring(i+1, n));
	        }
	    }

	}
	public static void main(String[] args) {
		Test1234.permutation(" ", "hello");
	}
}