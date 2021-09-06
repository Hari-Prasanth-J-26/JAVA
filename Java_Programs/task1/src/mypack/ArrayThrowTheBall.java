package mypack;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class ArrayThrowTheBall {
	
//	25 2 5786 937 3757 2988 990 2533 7535 1577 8601 3136 3302 4036 2287 2869 4803 3834 9190 7731 4542 2315 8400 2670 7432 733 9492

//	5 4 1 6 7 1 2
	
//	25 2 5786 937 3757 2988 990 2533 7535 1577 8601 3136 3302 4036 2287 2869 4803 3834 9190 7731 4542 2315 8400 2670 7432 733 9492
	
//  35 1 77 209 145 202 192 57 193 120 218 124 218 231 68 176 67 133 100 113 82 122 128 144 192 159 167 55 169 25 116 15 92 139 212 148 1
	
//  30 17 200 92 206 155 122 210 189 75 228 82 116 45 193 122 131 138 136 28 4 174 53 227 234 57 66 134 137 135 51 106
	
//	25 13 421 976 726 702 275 623 766 365 39 381 544 162 286 201 734 141 103 973 550 274 348 322 132 987 120
	
	public static int maxiPow(int N,int K, int[] A){
//		
//		int maxHeight = Integer.MIN_VALUE;
//		int oddCount = 0;
//		int throwBall = 0;
//		
//		for(int i=0;i<N;i++) {
//			if(A[i] >= maxHeight) {
//				maxHeight = A[i];
//				System.out.println("odd value - " +oddCount);
//				if(oddCount < K) {
//					throwBall++;
//				}
//				System.out.println(A[i]+" : "+throwBall);
//				if(A[i]%2!=0) {
//					if(A[0] == A[i])
//						oddCount = 0;
//					else
//						oddCount++;
//				}
//				
//			}
//		}
//		System.out.println("odd count : "+oddCount);
//		return throwBall;
//		
		
//		int count = 1;
//		for(int i = 1; i < N ; i++) {
//	      boolean flag = true;
//	      int odd = 0;
//	      for(int j = 0; j < N ;j++) {
//	          if(A[j] >= A[i]){
//	        	  flag = false;
//	        	  break;
//	          } 
//	          if(A[j]%2 != 0){
//	            odd++;
//	            //System.out.println(odd);
//	          }
//	      }
//	      if(flag && odd<=K)
//	    	  count++;
//	    }
//
//	     return count;

		
//		int count=0,i=0,oddleft=0,maxleft=0;
//		while(i<N) {
//			if(oddleft<K && A[i]>maxleft) {
//				count++;
//				maxleft = A[i];
//			}
//			if(A[i]%2!=0)
//				oddleft++;
//			i++;
//		}
//		return count;
		
		int throwBall=0,i=0,oddHeight=0,maxHeight=0;
		while(i<N) {
			if(oddHeight < K && A[i] > maxHeight) {
				throwBall++;
				maxHeight = A[i];
			}
			if(A[i]%2!=0)
				oddHeight++;
			i++;
		}
		return throwBall;
		
//		int result = 1;
//	    int odd = 0;
//	    int count = 0;
//
//	    if(A[0] >= 1){
//	    	result++;
//	      if(A[0]%2!=0){
//	        odd = A[0];
//	        //count++;
//	      }
//	    }
//
//	    for(int i=1;i<N;i++) {
//	      if(A[i] >= A[i-1]){
//	    	  if(A[i]%2!=0){
//	    		  odd = A[i];
//	    		  // count++;
//	    	  }
//	    	  if(odd <= K){
//	    		  result++;
//	    		  }
//	      	}
//	    }
//	    return result;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(maxiPow(N, K, A));

	}

}
