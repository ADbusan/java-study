package jh04;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 갯수 입력");
		int a = scan.nextInt();
		System.out.println("몇열 입력할지");
		int b = scan.nextInt();
		int[] c = new int[a];
		
		for(int i=0;i<b;i++) {
			System.out.println("순서대로 몇바구에서 몇번째 바구니까지 몇번의 공을 넣을것인가");
			int d = scan.nextInt();
			int e = scan.nextInt();
			int f = scan.nextInt();
			for(int j=d-1;j<e;j++) {
				c[j] = f;
			}
		}
		for(int i=0;i<a;i++) {
			System.out.println(c[i]);
		}
    }
}
