package com.javaex.practice;
import java.util.Scanner;

//숫자를 입력받아 아래와 같이 출력하세요
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		for ( int i = 1 ; i <= n ; i++ ) {
			int j = 1;
			while(j<=i) {
				System.out.print(i);
				j++;
			} 
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
