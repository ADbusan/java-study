package jh03;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b=0;
		for(int i=1;i<a+1;i++) {
			b+=i;
		}
		System.out.println(b);
	}
}
