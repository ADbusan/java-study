package jh04;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의  갯수를 입력");
		int a = scan.nextInt();
		System.out.println("몇 이하로 출력할건지 입력");
		int b = scan.nextInt();
		
		int[] d = new int[a];
		for(int i=0;i<a;i++) {
			int c = scan.nextInt();
			d[i] = c;
		}
		for(int i=0; i<a;i++) {
			if(d[i]<b) {
				System.out.println(d[i]);
			}
		}
	}
}
