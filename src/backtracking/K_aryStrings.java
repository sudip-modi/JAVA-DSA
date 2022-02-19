package backtracking;
import java.util.*;

public class K_aryStrings {
	int A[];
	
	public K_aryStrings(int n) {
		A=new int[n];
	}
	
	public void base_K_strings(int n,int k) {
//		process all the k-ary strings of length m
		if(n<=0) {
			System.out.println(Arrays.toString(A));
		}else {
			for(int j = 0; j <= k; j++) {
//				we have k possible combinations , for n places in the array
				A[n-1]=j;
				base_K_strings(n-1,k);
			}
		}
	}
	
	public static void main(String args[]) throws Exception{
		int n = 4;
		K_aryStrings obj = new K_aryStrings(n);
		obj.base_K_strings(n, 5);
	}
	
	
}
