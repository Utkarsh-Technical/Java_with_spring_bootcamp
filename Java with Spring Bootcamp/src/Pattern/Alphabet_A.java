package Pattern;

import java.util.Scanner;

public class Alphabet_A {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int  i = 0; i<n;i++) {
		for(int j=0; j<n;j++) {
			if(i==n/2 || (i==0 && j>0 && j<n-1) || (j==0 && i!=0) || (j==n-1 && i!=0))
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
