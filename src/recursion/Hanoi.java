package recursion;

public class Hanoi {
	public static void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg) {
//		if only one disc make return 
		if(n==1) {
			System.out.println("Move disc 1 from peg "+ frompeg+" to peg "+topeg);
			return;
		}
//		move top n-1 discs from a to b using c as auxiliary
		TowersOfHanoi(n-1,frompeg,auxpeg,topeg);
//		move remaining discs from a to c
		System.out.println("Move disc from peg "+frompeg+" to peg "+topeg);
//		move n-1 discs from b to c using a as auxiliary
		TowersOfHanoi(n-1,auxpeg,topeg,frompeg);
	}
	
	public static void main(String args[]) {
		TowersOfHanoi(3,'A','B','C');
	}
}