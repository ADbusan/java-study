package jh04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		중복되지않고 들어가게하는 인터페이스
		Set<Integer> a = new HashSet<>();
		
		for(int i=0;i<10;i++) {
			int b = scan.nextInt();
			a.add(b%42);
		}
		System.out.println(a.size());
		
	}
}
