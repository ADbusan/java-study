package jh05;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = scan.next();
		int sum = 0;
		
		for(int i=0;i<a;i++) {
//			Character.getNumericValue() 메서드는 문자를 해당하는 숫자 값으로 변환해주는 메서드입니다.
			int c = Character.getNumericValue(b.charAt(i));
			sum+=c;
		}
		System.out.println(sum);
	}
}
