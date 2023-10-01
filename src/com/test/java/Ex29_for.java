//Ex29_for.java
package com.test.java;

import java.util.Scanner;

public class Ex29_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		제어문 > 조건문 
		제어문 > 반복문
		
		반복문
		- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
		- 생산성 향상 + 유지보수 향상
		
		[for문]
		for (초기식; 조건식; 증감식) {
			문장;
		}
		
		초기식 : 루프 변수(i)를 초기화하는 역할
		조건식 : 루프 지속 유무 조건
		증감식 : 루프 변수에 변화를 주는 역할 > 언젠가 루프 탈출(false)
		
		*/
//		m1();	//"안녕하세요" * 5회 출력
//		m2();
//		m3();	//1부터 10까지 출력
//		m4();	//1부터 10까지 누적합
//		m5();	//1부터 n까지 누적합
//		m6();	//입력받아 누적합
//		m7();	//구구단
//		m8();	//무한루프
//		m9();	//break, continue
//		m10();	//break, continue
//		m11();	//조건
		m15();	//난수 만들기
	
	}//main
	
	private static void m15() {
		
		//난수 만들기
		//1. Math 클래스 > 대중화 방법(다른 언어에서도 사용)
		//2. Random 클래스 > 자바 방법
		
		System.out.println(3.14);
		System.out.println(Math.PI);		//파이값
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));	//절대값
		
		//returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0
		//0.0 ~ 0.9999999999
		System.out.println(Math.random());
		
		for(int i=0; i<10; i++) {
			//System.out.println(Math.random());
			
			//0~9 사이의 난수
			//System.out.println((int)(Math.random()*10));
			
			//1~10 사이의 난수
			//System.out.println((int)(Math.random()*10)+1);
			
			//0~3 사이의 난수
			//4~7 사의의 난수 = 0~3 사이의 난수 + 4
			System.out.println((int)(Math.random()*4)+4);
			
		}
		
	}//m15
	
	public static void m14() {
		//빈 리턴문
		//값을 반환하는 목적이 아니라 메소드를 중단하는 역할만 한다.
		return;
	}//m14
	
	//모든 경우의 수를 만들기 > else문 생성
	public static int m13() {
		//This method must return a result of type int
		//모든 경우의 수 반드시 return문이 존재
		int num=10;
		if (num % 2 == 0) {
			return 10;
		} else {
			return 0;
		}
	}//m13
	
	public static int m12() {
		return 10;
	}//m12

	private static void m11() {
		
		//요구사항) 사용자 입력 받아 숫자 누적
		//추가사항) 홀수만 입력, 짝수 입력 시 프로그램 중단
		Scanner scan = new Scanner(System.in);
		
		int num = 0;	//입력 값
		int sum = 0;	//누적 변수
		
		//회전수 예측하기 힘들 때, 무한루프 사용
		for (;;) {
			System.out.print("숫자 입력: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				break;
				//return;
			}
			
			sum += num;
			
		}
		System.out.println("sum : " + sum);
		
	}//m11

	private static void m10() {
		
		//학교 담임 선생님이 1번부터 30번까지 학생을 상담한다.
		for (int i=1; i<=30; i++) {
			
			//i번 부터 all stop
//			if(i==16) {
//				break;
//			}
			
			//i번만 제외
			if (i==10 || i==15) {
				continue;
			}
			System.out.printf("%d번 학생 상담중...\n", i);
		}
		
	}//m10

	private static void m9() {
		
		//break, continue > 독립적으로 사용 불가 > 다른 제어문과 함께 사용
		//break : 자신이 속한 제어문을 탈출(if문 인식 불가로 예외)
		//continue : 제어문의 시작으로 이동(처음으로 돌아가세요.)
		
		for (int i=1; i<=10; i++) {
			if (i==5) {
				//break;
				continue;
			}
			System.out.println(i);
		}

	}//m9

	private static void m8() {
		
		//무한루프, Infinite Loop
		//경우 1. 사용자 실수 > 수정
		//경우 2. 사용자 의도 > 왜?
		
//		int num = Integer.MIN_VALUE;
//		System.out.println(num);	//-2147483648
		
		
//		무한 루프가 아님
//		for(int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		//무한루프	> Integer 범위 안에서 계속 돌음
//		for(int i=0; true; i++) {
//			System.out.println(i);
//		}
//		for(;;) {
//			System.out.println(i);
//		}
		
	}//m8

	private static void m7() {
		
		//구구단
		int dan = 5;
		for (int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %2d\n", dan, i, dan*i);
		}
		
		//요구사항) 사용자가 원하는 단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("단: ");
		dan = scan.nextInt();

		for (int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %2d\n", dan, i, dan*i);
		}

	}//m7

	private static void m6() {
		
		//요구사항) 사용자로부터 숫자 10개를 입력받아 누적 합 출력
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i=0; i<10; i++) {
			System.out.print("숫자: ");
			sum += scan.nextInt();
		}
		System.out.println(sum);
		
	}//m6

	private static void m5() {
		
		//요구사항) 1부터 사용자가 원하는 숫자까지의 합
		Scanner scan = new Scanner(System.in);	
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		int sum = 0;
		//회전 : 컴파일(x), 런타임(o) > '지연된다'
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
		
	}//m5

	private static void m4() {
		
		//요구사항) 1~10까지의 합 > 누적
		//누적하기 : 누적변수, 초기화 필수
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}//m4

	private static void m3() {
		
		//반복문 : 루프변수
		//2. 반복문 사용할 때 익혀야 할 것 : 루프변수
		//루프 변수의 역할 : 회전수, 값
		
		//요구사항) 숫자 1~10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();

		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
	}//m3

	private static void m2() {		
		//반복문 : 회전수
		//1. 반복문 사용할 때 익혀야 할 것 : 반복문의 실행 횟수를 내가 제어할 수 있는가
		for (int i=1; i<=5; i++) {
			System.out.println("실행문1.");
		}
		
		for (int i=5; i<=9; i++) {
			System.out.println("실행문2.");
		}

		for (int i=1; i<=5; i+=2) {
			System.out.println("실행문3.");
		}
		
		for (int i=5; i>0; i--) {
			System.out.println("실행문4.");
		}
		
	}//m2

	private static void m1() {		
		//요구사항) "안녕하세요" x 5회 출력
		
		//case 1.
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		
		//case 2.
		hello();
		hello();
		hello();
		hello();
		hello();
		
		//case 3.
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요.");
		}
		
		//1. int i=1
		//2. i<=5
		//3. 블럭(문장) 실행
		//4. i++ : '}'를 만나면 다시 증감식으로 돌아감
		//5. i<=5
		//6. 블럭(문장) 실행
		//7. i++
		//8. i<=5
		//9. 블럭(문장) 실행

	}//m1
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}//hello

}
