import java.util.*;
class Solution {
   static int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i=0 ; i < n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        if (count > pos && count>n/2)
            return 1;
      
        return -1;
        
    }
    public static void main(String[] args) {
		//int arr[] =new int[]{1,1,1,1,50};
		int arr1[] =new int[]{2,2,2,2,2,1,1,1,50};
		//int k=Solution.solution(arr);
		int k1=Solution.solution(arr1);
		System.out.println(" "+k1);
		
	}
}