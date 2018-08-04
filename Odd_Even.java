package codekatta_SET1;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0 && num>0) {
			System.out.println("Even");
		}
		else if(num%2==1 && num>0) {
			System.out.println("Odd");
		}
		else if(num==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
