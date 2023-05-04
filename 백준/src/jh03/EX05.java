package jh03;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] e = new int[a];
		for(int i=0;i<a;i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			e[i]=b+c;
		}
		for(int i=0;i<a;i++) {
			System.out.println(e[i]);
		}
		
	}
}
