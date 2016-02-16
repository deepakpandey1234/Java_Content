import java.util.List;
import java.util.ArrayList;
class Permutation3Split {
	public static void breaker(String input, int start, int end, List ans){
	    if(start>end)
	        System.out.println(ans);
	    else {

		    ans.add(input.charAt(start) + "");
		    breaker(input, start+1, end, ans);
		    
		    int listSize = ans.size();
		    ans.remove(listSize - 1);
		    String lastChar = ans.get(listSize - 2).toString();
		    ans.remove(listSize - 2);
		    ans.add(lastChar + input.charAt(start) + "");
		    breaker(input, start+1, end,ans);
		}
	}
    public static void main(String args[]){
	String input = "abcd";
	List ans = new ArrayList();
	ans.add(input.charAt(0) + "");
	breaker(input,1, 3, ans);
	}
}