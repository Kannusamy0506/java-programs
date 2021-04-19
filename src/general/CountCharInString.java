package general;

import java.io.*;
import java.util.Scanner;


public class CountCharInString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) { 
        int count=0;
        char arr[] = s.toCharArray();
        for(int i=0;i<n;i++){
           s=s+arr[i];
        }
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='a'){
                    count++;
                }
            }

            System.out.println(count);
        return count;                      

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
