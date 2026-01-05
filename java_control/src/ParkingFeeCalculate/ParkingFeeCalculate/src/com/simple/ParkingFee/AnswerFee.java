package com.simple.ParkingFee;

import java.util.Scanner;

public class AnswerFee {

	public static void main(String[] args) {
		// 과제 : 주차장에 요금이 기본요금은 1000원이다.
		// 기본 시간은 30분이다.
		// 10분 당 100원씩 추가 (예: 39분은 1000원, 40분은 1100원 )
		// 단, 4시간 이상 주차시 기본 요금은 2500원이다.
		// (예: 3시간 50분 (230분) - 3000원, 4시간 12분 (252분) -> 2600원)
		
		int cost = 1000; // 기본요금 (30분)
		int inc = 100; // 10분당 100원
		int time = 30;
		
		// 주차 시간 총 몇분 입력
		Scanner scan = new Scanner(System.in); // 시스템(컴퓨터)으로부터 입력된 키 값 받기
		
		System.out.println(" 총 몇분 주차 : ");
		int pTime = scan.nextInt(); // 키보드 입력 값 받아서 정수로 변환하여 변수에 저장
		
		

	}

}
