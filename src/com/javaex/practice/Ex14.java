package com.javaex.practice;
import java.util.Scanner;

//13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		int r = 0;
		
		for(int i = 1; i<=n ;i++) {
			r = r+i;
			System.out.print(i);
			
			while(i<n) {
				System.out.print("+");
				break;
			}
		}
		
		System.out.println("\n합계 : " + r);
		
		sc.close();
	}

}
