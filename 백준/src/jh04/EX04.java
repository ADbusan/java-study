package jh04;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[9];
		int max = 0;
		int b = 0;
		for(int i=0; i<9;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<9;i++) {
			if(a[i] > max) {
				max = a[i];
				b = i+1;
			}
		}
		System.out.println(max+" "+b);
		
	}
}
