package jh05;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		trim(); 앞뒤 공백 제거
		String a = scan.nextLine().trim();
//		split(" "); b 배열에다가 " "간격으로 입력
		String[] b = a.split(" ");
		
//		b의 배열의 갯수를 count에 입력 인트로
		int count = b.length;
		
		System.out.println(count);
	}
}
