import java.util.Scanner;

public class Recursion {
	public static void main(String args[]) {
		int start, sub, count;
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Type a starting number: ");
		start = scnr.nextInt();
		System.out.print("Type number to subtract: ");
		sub = scnr.nextInt();
		count = countOccur(start, sub);
		System.out.printf("%d can have %d subtracted from it %d time(s).", start, sub, count);
	}
	public static int countOccur(int start, int sub) {
		int count = 0;
		if (start - sub >= 0) {
			count = countOccur(start - sub, sub) + 1;
		}
		else {
			count = 0;
		}
		return count;
	}
}
