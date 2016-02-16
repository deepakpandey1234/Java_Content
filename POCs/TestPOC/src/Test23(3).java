
public class Test23 {
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Hello";
		String k="robot";
		String j=Test23.check(s);
		String f=Test23.check(k);
		System.out.println(j+"  "+k);
			}
			public static String check(String input)
			{
				for(int i=0;i<input.length();i++)
				{
					if(input.charAt(i) ==input.charAt(i+1))
					{
						return input;
					}
								}
									return "null";
			}
}
