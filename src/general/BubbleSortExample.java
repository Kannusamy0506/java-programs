package general;

public class BubbleSortExample {

	public static void main(String args[]){
		
		int[] arr = {60,40,50,10};
		
		int n = arr.length;
		
		int temp = 0;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}
