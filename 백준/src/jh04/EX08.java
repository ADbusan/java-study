package jh04;

import java.util.Scanner;

public class EX08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int count = 0;
		
		
		for(int i=0;i<10;i++) {
			
			System.out.println("숫자를 입력");
			int b = scan.nextInt();
			a[i] = b%42;
		}
		for(int i=0; i<10;i++) {
				if(a[i]!=a[i+1]) {
					count++;
			}
		}
		System.out.println(count);
	}
}
