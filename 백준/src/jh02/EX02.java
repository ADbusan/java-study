package jh02;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>=90) {
			System.out.println("A");
		}else if(80<=a && a<=89) {
			System.out.println("B");
		}else if(70<=a && a<=79) {
			System.out.println("C");
		}else if(60<=a && a<=69) {
			System.out.println("D");
		}else {
			System.out.println("F"); 
		}
	}
}
