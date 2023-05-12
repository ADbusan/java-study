package jh06;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6]; 
		for(int i=0;i<6;i++) {
			a[i]= scan.nextInt();
		}
		int[] b = {1,1,2,2,2,8};
		for(int i=0;i<6;i++) {
			int c = b[i]-a[i];
			System.out.print(c+" ");
		}
	}
}
