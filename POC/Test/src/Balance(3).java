
public class Balance {
	public boolean canBalance(int[] nums) {
		  int leftSum = 0, rightSum = 0, i, j;
		  if(nums.length == 1)
		      return false;
		  for(i=0, j=nums.length-1; i<=j ;){
		      if(leftSum <= rightSum){
		         leftSum+=nums[i];
		         i++;
		      }else{
		         rightSum+=nums[j];
		         j--;
		      }
		  }
		  System.out.println(rightSum + "  "+ leftSum);
		  return (rightSum == leftSum);
		}
	public static void main(String[] args) {
		int[] a=new int[]{1,1,1,1,1,1};
		System.out.println(new Balance().canBalance(a));		
	}
}
