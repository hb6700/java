package com.test.java;

public class Ex07_Variable {
	
	public static void main(String[] args) {
		//Ex07_Variable
		//숫자형 데이터 : 저장할 변수가 필요한 경우
		//수치로써의 데이터 :  산술연산의 대상 -> 더하기 빼기 등
		//수치가 아닌 데이터 : 산술연산의 대상이 아님 -> 
		//숫자형식이지만 실제로 숫자취급하지 않는 것 : 주민번호, 학번, 전화번호
		
		//1. 몸무게
		int weight = 70;
		
		//2. 주민등록번호(990718)
		int jumin = 990718;
		System.out.println("주민등록번호 : " + jumin);
		
		jumin = 000717;		//자바에서는 8진수로 인식
		System.out.println("주민등록번호 : " + jumin);
		
		String jumin2 = "000717";
		System.out.println("주민등록번호 : " + jumin2);
		
		//자바 기수 표기법
		//숫자 데이터 표기 : 3개의 기수법 지원
		//1. 10진수 : 10 -> 10 
		//2. 8진수 : 010 -> 8
		//3. 16진수 : 0x10 -> 16
		
		//기수 표현에 상관없이 10진수로 출력
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
	}

}
