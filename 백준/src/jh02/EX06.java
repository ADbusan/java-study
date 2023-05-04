package jh02;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = scan.nextInt();

        int d = b + c;
        int e = a + d / 60; 
        d %= 60; 

        System.out.println(e % 24 + " " + d);
	}
}
