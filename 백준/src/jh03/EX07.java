package jh03;

import java.util.Scanner;

public class EX07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=1;i<a+1;i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));
		}
	}
}
