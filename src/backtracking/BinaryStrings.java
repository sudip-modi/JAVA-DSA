package backtracking;

//generate all strings of n bits, assume A[0-n-1] is an array of size n
public class BinaryStrings {
	int[] A;
	
	static void generateAllBinaryStrings(int n,int arr[],int i) {
		if(i==n) {
			printTheArray(arr,n);
			return;
		}
//		assign 0 to ith position then try for all other permutations
		arr[i]=0;
		generateAllBinaryStrings(n,arr,i+1);
//		in the first call to generate function we are just passing the
//		increased value of i this does not actually change the value 
//		of i, so it is fine to pass the increased value of i, when 
//		the value in the array is 1 at the ith position
		arr[i]=1;
//		assign 1 to ith position then try for all other permutations
		generateAllBinaryStrings(n,arr,i+1);
	}
	
	static void printTheArray(int arr[],int n) {
		for(int i = 0; i < n; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int n = 4;
		int[] arr = new int[n];
//		n is size of the array, arr is the array, 0 is the index 
//		from where it starts, i is the value of index from where 
//		we start the permutation
		
		generateAllBinaryStrings(n,arr,0);
//		the difference between n and i will decide how many places 
//		from the right will experience permutation
	}
}
