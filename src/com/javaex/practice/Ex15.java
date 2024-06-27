package com.javaex.practice;
import java.util.Scanner;

/*아래와 설명에 맞는 프로그램을 작성하세요
숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요
예를들어 10을 입력한 경우 1, 2, 5, 10 이 출력된다.*/
public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		for (int r = 1 ; r <= n  ; r++) {
			if( n%r == 0 ) {
				System.out.println(r);
			}
		}
		
		
		sc.close();
	}

}
