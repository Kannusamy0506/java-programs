package general;

public class AnagramCountInboth {

	public static void main (String args[]){
  
		 int count = makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		 System.out.print(count);
		
	}
	
	static int makeAnagram(String a, String b) {


    String str1 = a.replace(" ","").toLowerCase();
    String str2 = b.replace(" ","").toLowerCase();
    
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    
    int[] alp = new int[26];
    for(int i=0;i<arr1.length;i++){
       int index = arr1[i]-'a';
       alp[index]++;           
    }
    
    for(int i=0;i<arr2.length;i++){
       int index = arr2[i]-'a';
       alp[index]--;
    }
    
    int  i=0;
    int count=0;
    int positiveInt = 0;
    int negativeInt = 0;
    while(i<alp.length){
    	if(alp[i]>0){
          positiveInt = positiveInt+alp[i];    		
    	}else if (alp[i]<0){
    		negativeInt = negativeInt+alp[i];
    	}
    	i++;
    }
    
    int x = positiveInt - negativeInt;
  
  return x;
}

}