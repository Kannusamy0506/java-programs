package general;

public class CheckPangram {

	public static void main (String args[]){
		
		String s = "THE QUICK BROWN FOX JUMPS OVER A  DOG";
		
		s = s.replace(" ", "");
		
		char[] arr = s.toCharArray();
		
		int[] alp = new int[26];
		
		int i=0;
		while(i<arr.length){
			int index = arr[i]-65;
			alp[index]= 1;
			++i;
		}
		
		i=0;
		
		String result = "";
		while(i<alp.length){
			if(alp[i]==1){
				++i;
			}else{
				System.out.println("Non-Pangram");
				System.exit(0);
			}
		}
		
		System.out.print("Pangram");
	}
}
