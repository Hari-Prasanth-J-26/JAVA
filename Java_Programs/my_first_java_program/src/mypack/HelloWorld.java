package mypack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class HelloWorld {
	/*
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
       
    }
    
    1 1 1 0 0 0
	0 1 0 0 0 0
	1 1 1 0 0 0
	0 0 2 4 4 0
	0 0 0 2 0 0
	0 0 1 2 4 0
    */
    
    public static int HourGlassLargestSum(int[][] arr) {
    	int max = Integer.MIN_VALUE;
    	int sum = 0;
    	for(int m=0;m<3;m++) {
    		for(int n=0;n<3;n++) {
    			if(arr[m][n]>0)
    				sum += arr[m][n];
    		}
    	}
    	if(sum > max)
    		max = sum;
    	
    	return max;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
    	//System.out.println(arr.length);
    	
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
    	}
    	//System.out.println(Arrays.toString(arr));
    	System.out.println(HourGlassLargestSum(arr));
    }
}


