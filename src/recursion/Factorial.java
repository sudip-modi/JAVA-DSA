package recursion;

public class Factorial {
	public long factorial(long number) {
		if(number<=1) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
	}
	
	public static void main(String args[]) {
		Factorial obj = new Factorial();
		for(int counter = 0; counter <= 10; counter++) {
			System.out.printf("%d! = %d\n",counter,obj.factorial(counter));					
		}
	}
}
