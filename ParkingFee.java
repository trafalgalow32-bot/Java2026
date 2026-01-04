package com.simple.ParkingFee;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		//과제 : 주차장에 요금이 기본요금은 1000원이다. 
		// 기본 시간은 30분이다.
		// 10분 당 100원씩 추가 (예: 39분은 1000원, 40분은 1100원 )
		// 단, 4시간 이상 주차시 기본 요금은 2500원이다. 
		// (예: 3시간 50분 (230분) - 3000원, 4시간 12분 (252분) -> 2600원) 
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("몇 분 주차하셨습니까?");
		int m = kbd.nextInt();
		int fee = 0;
		
		if (m >= 1 && m<=30 ) {
			fee = 1000;
		} else if (m >= 40 && m <=239) {
			fee = 1000+((m-30)/10*100);
		} else if (m >= 240) {
			fee = 2500;
		}
		System.out.println("주차시간 : "+m+"\n 주차요금 : "+fee);
	}

}
