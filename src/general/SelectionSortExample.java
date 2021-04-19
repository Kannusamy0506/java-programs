package general;

public class SelectionSortExample {

	public static void main(String args[]){
		
		int[] arr = {8,9,5,6,7};

		int n = arr.length;
		int min, i, j, temp;
		
		for(i=0;i<arr.length;i++){
	         
	         min=i;
	         
	         for(j=i+1;j<arr.length;j++){
	             if(arr[j]<arr[min]){
	                 min=j;
	             }
	         }
	         temp = arr[i];
	         arr[i]=arr[min];
	         arr[min]=temp;
	     } 
		
		
		for(i=0;i<n;i++){
		System.out.println(arr[i]);	
		}
	}
	
}