//Ex11_BufferedReader.java
package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_BufferedReader {

	public static void main(String[] args) throws Exception{
		

//		콘솔 입력 > 키보드
//		1. System.in.read() //불편함
//		2. BufferedReader 클래스
//		3. Scanner 클래스

//		-------------------------------------------------------------------------
		
//		BufferedReader 클래스
//		int a
//		ctrl + shift + O ;
//		reader : 콘솔 입력 도구
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("문자 입력 : ");
//		int code = reader.read();
//		System.out.printf("%c\n", code);
		
//		String line = reader.readLine();
//		System.out.println(line);
//		System.out.print("이름 입력 : ");
		
//		readLine() : 입력 버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
//		엔터는 자동으로 삭제
//		System.out.print("이름 입력 : ");
//		String name = reader.readLine();
//		System.out.printf("안녕하세요. %s님\n", name);
		
//		-------------------------------------------------------------------------
		
//		Wrapper Class(Utility Class) : 원시형 데이터를 도와주는 기능을 제공하는 클래스	
//		byte > Byte 클래스
//		short > Short 클래스
//		***int > Integer 클래스
//		***long -> Long 클래스
//		float -> Float 클래스
//		***double -> Double 클래스
//		boolean > Boolean 클래스
//		char > Chracter 클래스

//		System.out.print("숫자 입력 : ");
//		String num = reader.readLine();				//100 -> '100' : 입력값은 무조건 문자열로 저장
//		int num2 = Integer.parseInt(num);			//'100' -> 100
//		System.out.println(num2);					//100
		
//		double num3 = Double.parseDouble(num);
//		System.out.println(num3 * 2);				//200.0
		
//		System.out.println(num * 2);				//"홍길동" * 2 
//		System.out.printf("안녕하세요. %s님\n", num);
//		System.out.println(num2 * 2);

//		-------------------------------------------------------------------------

//		요구사항) 숫자 2개 입력 > + 연산 > 연산 과정과 결과를 모두 출력
//		숫자1: 5
//		숫자2: 3
//		5 + 3 = 8
		
//		System.out.print("첫번째 숫자 입력 : ");
//		String input1 = reader.readLine();			//입력받은 값 -> 문자열 형태로 구성
//		System.out.print("두번째 숫자 입력 : ");
//		String input2 = reader.readLine();			//입력받은 값 -> 문자열 형태로 구성
	
//		int n1 = Integer.parseInt(input1);	//문자열값 -> 정수형으로 변경
//		int n2 = Integer.parseInt(input2);	//문자열값 -> 정수형으로 변경
//		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
//		System.out.println(input1 + "+" + input2 + "=" + (n1+n2));
		
		System.out.print("숫자 : ");
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		
//		java.lang.ArithmeticException: / by zero
//		피제수/제수 -> 제수는 0이 될수 없다
		System.out.println(100/num); //0 입력시 런타임 에러
		
//		-------------------------------------------------------------------------
		
		/*
		에러(Error) 종류
		- 오류, 버그, 예외 등..
		
		1. 컴파일 에러 : 컴파일 작업 중에 발생하는 에러
		- 컴파일러가 발견(javac.exe) > 문법이 틀려서
		- 발생 시, 모든 컴파일 작업 중단 > 프로그램 생성 불가하므로 반드시 해결
		- 이클립스 연동되어 빨간 밑줄로 표시
		- 난이도가 가장 낮은 에러 > 고치기 쉬움
		
		2. 런타임 에러
		- 런타임(Runtime) > 프로그램 실행 중
		- 컴파일 작업 중에는 에러가 없음 > 실행 중에 발생하는 에러
		- 문법에는 오류가 없고, 다른 원인으로 발생하는 에러
		- 예외(Exception)에러 라고도 함
		- 난이도 중간 : 발견이 될 수도 안 될 수도 있음
		- 사전에 충분한 테스트 필요
		
		3. 논리 에러
		- 컴파일 성공 + 실행 성공 하지만, 최종 결과가 이상
		- 알고리즘 문제 등 다양한 곳에서 발생
		- 난이도 최상 : 발견 최악 + 수정 최악
		*/
		
	}

}
