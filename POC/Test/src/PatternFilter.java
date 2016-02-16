/*char str[90]="my brother is taller than me@1233334. I always a short man,but smart than him"; 

1)Remove spaces between words, 
2)Find the longest word in the String, 
3)Search and count the number of letters"e" in the string
4)Extact the number of integers in string 
5)Extract the number of doubles in string 
6)Extract the number of words in string 
7)Identify the number of sentences in the String.*/

public class PatternFilter {
public static void main(String[] args) {
	String str="my brother is taller than me@1233334. I always a short man,but smart than him";
	String[] word=str.split(" ");
	
	//remove spaces between words
	String wordtemp=null;
	for(int i=0;i<word.length;i++){
		wordtemp+=word[i];
	}
	System.out.println("word without space"+wordtemp);
	
	//longest word in String
	int max=0;
	for(int i=0;i<word.length;i++)
	{
		if(word[i].length()>max){
			max=word[i].length();
		}
	}
	System.out.println("longest word"+max);
	
	//number of letter e
	int count=0,counter=0,counter2=0;
	char[] fullword=str.toCharArray();
	for(int i=0;i<fullword.length;i++){
		if(fullword[i]=='e'){
			count++;
		}
		//number of integer in sentence
		else if(fullword[i]>'0' && fullword[i]<'9')
		{
			counter++;
		}
		
		}

	System.out.println("number of e are:"+count);
	System.out.println("number of integer are:"+counter);
	
	//number of doubles
	for(int i=0;i<fullword.length-1;i++){
	if(fullword[i]==fullword[i+1]){
		counter2++;
	}
	}
	System.out.println("number of doubles are:"+counter2);
	
	
	//number of 
}

}
