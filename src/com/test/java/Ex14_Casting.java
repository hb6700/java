//Ex14_Casting.java
package com.test.java;

public class Ex14_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정수형 리터럴은 int이다.
//		실수형 리터럴은 double이다.
		
		//byte(작은 형 : 1) = int(큰 형 : 4) >> 서비스 문법 > 미리 컴파일 오류를 발생시킴, 오버플로우가 발생하지 않음
		byte b1 = 10;
		
		//short(작은 형 : 2) = int(큰 형 : 4) >> 서비스 문법
		short s1 = 10;
		
		//int(4) = int(4)
		int n1 = 10;
		
		//long(큰 형 : 8) = int(작은 형 : 4)
		long l1 = 10;			//long l1 = (long)10;
		
		//float = double
		//작은형(4) = 큰 형(8)
		//float f1 = 3.14;
		float f1 = 3.14F; //명시적인 방법 대신하여 F 붙이기
		//float f1 = (float)3.14;
		
		//double = double
		double d1 = 3.14D;
		
		//------------------------------------------------------------------------
		int n2 = 100;				//원본 4byte
		float n3;					//복사본 4byte
		
		//int(4) = float(4)
		//(암시적)형변환 발생 -> 안전함
		n3 = n2;
		System.out.println(n3);		//100.0
		
		
		int n4;						//복사본
		float n5 = 100;				//원본
		
		//float(4) = int(4) >> 암시적 형변환(??)
		n4 = (int)n5;
		System.out.println(n4);
		
//		정수와 실수간의 크기 비교는 단순하게 byte로 하는게 아니라 실제 표현 가능한 숫자의 범위로 비교해야 한다.
//		int(4) < float(4), long(8) < double(8)
//		크기 정리
//		byte(1) < short(2) < int(4) < logn(8) <<< float(4) < double(8)
		
//		char > 겉보기는 문자, 속으로 숫자 > 프로그램 입장에선 숫자 취급
		char m1 = 'A';	//2byte
		short m2;		//2byte
		
		//형변환
		//short(2byte) = char(2byte)
		m2 = (short)m1;
		System.out.println(m2);
		
		char m3;
		short m4;
		
		m4=65;			//44032
		
		//서로 자료형이 다르니 형변환 발생
		//char(2byte) = short(2byte)
		m3 = (char)m4;
		System.out.println(m3);
		
		int m5 = 44032;
		char m6;
		System.out.println((char)m5);
		
		int m7;
		char m8;
		
		m8 = '가';
		System.out.println((int)m8);
		
//		*** 값형끼리 형변환
//		*** 값형과 참조형끼리 형변환 절대 불가능
//		*** boolean 형변환 불가능
//		정수 > 정수
//		실수 > 실수
//		정수 > 실수
//		실수 > 정수
//		문자(정수) > 정수
//		정수 > 문자(정수)
		
//		값형 <-> 값형 : 형변환O
//		값형 <-> 참조형 : 형변환X
		
		String a1 = "100";
		int a2;
		
		a2 = Integer.parseInt(a1);		//형변환이 아님, "100" -> 100
		System.out.println(a2);
		
		//String.valueOf : int > String
		String a3;
		int a4 = 100;
		
		//String.valueOf(값형 데이터)
		a3 = String.valueOf(a4); 	//100 -> "100"		//잘 사용하지 않음
		//값형과 참조형은 이론상 불가능하지만 할 수는 있음
		a3 = a4 + "";				//100 + "" -> "100"
		
		
	}

}
