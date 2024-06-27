package com.javaex.practice;
import java.util.Scanner;

/*팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요.
5 입력시 1*2*3*4*5 의 값이 출력됩니다.
7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
팩토리얼공식 𝐧! = 𝟏 × 𝟐 × 𝟑 × ⋯ × 𝐧  */
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		int r = 1;
		
		for(int i = 1; i<=n ;i++) {
			r = r*i;
		}
		
		System.out.println("결과값 : " + r);
		
		
		sc.close();
	}

}
