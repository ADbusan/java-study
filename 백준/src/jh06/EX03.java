package jh06;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b =0;
		int[] d = new int[b];
		
		for(int i=0;i<a;i++) {
			b = scan.nextInt();
			int sum =0;
			for(int j=0;j<b;j++) {
				System.out.println("점수를 입력");
				int c = scan.nextInt();
				sum+=c;
			}
			
		}
	}
}
