package jh04;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("바구니 총 N개를 입력");
		int a = scan.nextInt();
		System.out.println("바꿀 바구니 갯수를 입력");
		int b = scan.nextInt();
		
		int[] c = new int[a];
		
		for(int i=0;i<a;i++) {
			c[i]=i+1;
		}
		for(int i=0;i<b;i++) {
			int f;
			int d = scan.nextInt();
			int e = scan.nextInt();
			
			f=c[d-1];
			c[d-1]=c[e-1];
			c[e-1]=f;
		}
		for(int i=0;i<a;i++) {
			System.out.println(c[i]);
		}
	}

}
