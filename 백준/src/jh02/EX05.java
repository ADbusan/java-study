package jh02;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b<45) {
			int c = b+15;
			System.out.println(a-1);
			System.out.println(c);
		}else if(b>45) {
			System.out.println(a);
			System.out.println(b-45);
		}else if(a==0 && b<45) {
			System.out.println(23);
			System.out.println(b+15);
		}else if(a==0 && b>45) {
			System.out.println(a);
			System.out.println(b-45);
		}
	}
}
