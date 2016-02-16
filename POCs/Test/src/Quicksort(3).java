
public class Quicksort {
	
	public static void main(String[] args) {
		int arr[]=new int[]{3,4,2,5,2,9,7,10};
		
		quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	static void quicksort(int arr[],int first,int last){
	    int pivot,i,j,temp;

	     if(first<last){
	         pivot=first;
	         i=first;
	         j=last;
	         
	         while(i < j) {
	             
	             while(arr[i] <= arr[pivot] && i <= last)
	               i++;
	            
	             while(arr[j] > arr[pivot] && j >= first)
	               j--;
	             
	             if(i < j) {
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	             }
	             
	           }

	           temp = arr[j];
	           arr[j] = arr[pivot];
	           arr[pivot] = temp;
	          
	           quicksort(arr, first, j-1);
	           quicksort(arr, j+1, last);
	         }
	    }

}
