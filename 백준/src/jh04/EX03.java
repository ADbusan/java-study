package jh04;


import java.util.Arrays;
import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의 갯수를 입력");
		int a = scan.nextInt();
		int[] c = new int[a];
		
		for(int i=0; i<a; i++) {
			c[i] = scan.nextInt();
		}
//		숫자를 순서대로 정렬
		Arrays.sort(c);
		System.out.println(c[0]+" "+c[a-1]);
	}
}
