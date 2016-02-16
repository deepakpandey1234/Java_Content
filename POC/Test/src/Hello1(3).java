import java.util.*;

public class Hello1{
	
public static void main(String[] args) {
	Hello1 h=new Hello1();
	Set<String> temp=h.palindromes("aabaa");
	System.out.println(temp);
}

public Set<String> palindromes(final String input) {

     final Set<String> result = new HashSet<>();
         //ignoring single character
     for (int i = 0; i < input.length(); i++) {
         //even length palindromes:
         expandPalindromes(result,input,i,i+1);
         //odd length palindromes:
         expandPalindromes(result,input,i,i);
     } 
     return result;
  }

  public void expandPalindromes(final Set<String> result, final String s, int i, int j) {
      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            result.add(s.substring(i,j+1));
            i--; 
            j++;
            
      }
  }
}