/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/

public class PatternQuora {
public static void main(String[] args) {
	for(int i=0;i<7;i++){
		int a = 4;
		for(int j=0;j<7;j++){
			
			if(i==0 || j==0 || j==6 || i==6){
				System.out.print(a);
				continue;
			}
			if ((i>0 && i<2) && j > 0) {
				System.out.print(a-1);
				continue;
			}
			if (i>1 && j > 1) {
				System.out.print(a-2);
				continue;
			}
			
			}
		
		System.out.println("\n");	
	}
	
}
}
