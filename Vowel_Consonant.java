package codekatta_SET1;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c= sc.next().charAt(0);
		if(Character.isAlphabetic(c)) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("Vowel");
			}
			else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println("Vowel");
			}
			else {
				System.out.println("Consonant");
			}
		}
		else {
			System.out.println("Invalid");
		}	
		sc.close();
	}
}
