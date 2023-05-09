package jh04;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의 갯수 입력");
		int a = scan.nextInt();
		System.out.println("찾을 숫자를 입력");
		int c = scan.nextInt();
		
		int[] d = new int[a];
		int count = 0;
		
		for(int i = 0 ; i< a ; i++) {
			int b = scan.nextInt();
			d[i] = b;
		}
		for(int i=0;i<a;i++) {
			if(d[i] == c) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
