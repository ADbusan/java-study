package jh06;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		문자열을 각각 알파벳으로 만들어 배열에 넣음
		String[] a = scan.nextLine().split("");
//		문자열을 뒤집어서 넣을 배열 생성
		String[] b = new String[a.length];
		
//		문자열을 뒤집에서 각각 알파벳을 배열으 넣음
		for(int i=0;i<a.length;i++) {
			b[i]=a[a.length-i-1];
		}
		
//		배열로 나눠져있던 알파벳을 조인해서 문자열로 만들어 다시 저장
		String c = String.join("",a);
		String d = String.join("",b);
		
		
//		c의 문자열과 d의 문자열이 같으면 1같지않으면 0을 출력하게 작성 
		if(c.equals(d)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
