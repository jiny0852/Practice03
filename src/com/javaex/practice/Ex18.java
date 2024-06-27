package com.javaex.practice;
import java.util.Scanner;

//숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		//위쪽
		for (int i = 0 ; i < n-1 ; i++) {
			
			int j = n-i;
			for( ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래쪽
	    for (int i = 1 ; i <= n ; i++) {
	    	
	    	int j = 2;
	    	for ( ; j < i+2 ; j++) {
	    		System.out.print("*");
			}
			System.out.println();
	    }
		
		sc.close();
	}

}
