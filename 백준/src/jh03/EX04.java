package jh03;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int e = 0;
		
		for(int i=0;i<b;i++) {
			int c = scan.nextInt();
			int d = scan.nextInt();
			int f = c*d;
			e+=f;
		}
		if(a==e) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
