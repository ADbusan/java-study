package jh04;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의 갯수를 입력");
		int a = scan.nextInt();
		int[] c = new int[a];
		int min = 0;
		int max = 0;
		for(int i=0;i<a;i++) {
			int b = scan.nextInt();
			c[i] = b; 
		}
		for(int i=0; i<a; i++) {
			if(c[i]<c[i+1]) {
				min = c[i];
			}else if(c[i]<c[i+1]) {
				max = c[i+1];
			}
		}
		System.out.println(min+max);
	}
}
