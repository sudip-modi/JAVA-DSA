package recursion;

public class SortArray {
	public static int isArrayInSortedOrder(int[] array,int index) {
		if(array.length==1||index==1) {
			return 1;
		}
		if(array[index-1]<array[index-2]) {
			return 0;
		}else {
			return isArrayInSortedOrder(array,index-1);
		}
	}
	
	public static void main(String args[]) {
		int[] array = {2,3,4,5,6,1};
		System.out.println(isArrayInSortedOrder(array,1));
	}
}
