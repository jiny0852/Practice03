package com.javaex.practice;
import java.util.Scanner;

/*아래와 설명에 맞는 프로그램을 작성하세요
숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
예를들어 22을 입력한 경우 5의배수 개수: 4, 5의배수 합: 50 이 출력된다.
- 5의배수 개수 : 5, 10, 15, 20 → 4개
- 5의배수 합 : 5+10+15+20 → 50*/
public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		int n5 = 0; //5의 배수의 갯수 값
		int r = 0;  //합계
		
		for ( int i = 1 ;  (i*5) <= n  ; i++ ) {
			
			if ( n >= (5*i)) {
				n5++;
				r = r + (i*5);
			}
			
		}
		System.out.println("5의 배수의 갯수 : " + n5 
				         + "\n5의 배수의 합 : " + r);
		
		
		sc.close();
	}

}
