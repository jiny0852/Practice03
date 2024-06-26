package com.javaex.practice;
import java.util.Scanner;

//아래와 같이 구구단을 출력하세요
public class Ex08 {

	public static void main(String[] args) {
		
		
		for ( int i = 1 ; i < 10 ; i++) {
			int j = 2;
			while (j<10) {
				System.out.print(j + "*" + i + "=" + i*j + " ");
				j++;
			}
			System.out.println();
		}
		
	}

}
