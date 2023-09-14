//Ex15_Operator.java
package com.test.java;

public class Ex15_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		연산자, Operator
		- 수학 연산자 > (대부분) 프로그래밍 연산자
		- 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동의 결과를 반환하는 역할
		- 주로 기호를 많이 사용 + 단어도 많이 사용
		
		1. 문장, Statement
			- 1개 이상의 표현식이 모여서 문장을 만든다.
			- int sum = 10 + 20;
			
		2. 표현식, Expression
			- 문장을 구성하는 최소 단위 > 하나의 완성된 문장을 만들 수 있는 최소 표현
			- int sum
			- 10 + 20
			- sum = 30
			
		3. 연산자, Operator
			- 연산자 종류
			1) 행동(목적)
				a. 산술 연산자
				b. 비교 연산자
				c. 논리 연산자
				d. 대입 연산자
				e. 증감 연산자
				f. 조건 연산자
				g. 비트 연산자
				
			2) 용법(피연산자 개수)
				a. 1항 연산자
				b. 2항 연산자
				c. 3항 연산자
		
		4. 피연산자, Operand
		
			- = : sum, 30
			
		5. 연산자 우선 순위
			- 하나의 문장에 속해있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
			- 1 + 2 * 3
		
		6. 연산자 연산 방향
			- 하나의 문장에 속해있는 연산자들 중 우선 순위 동일하면 누가 먼저 실행하는지에 대한 규칙
			- 대부분 : 왼쪽에서 오른쪽으로 진행
					
		*/
		
//		1. 산술 연산자
//		- +, -, *, %(mod, 나머지)
//		- 2항 연산자
//		- 피연산자로 숫자형을 가진다.
		int a = 10, b = 3;
		System.out.printf("%d + %d = %d\n", a, b, a+b);			//10 + 3 = 13
		System.out.printf("%d - %d = %d\n", a, b, a-b);			//10 - 3 = 7
		System.out.printf("%d * %d = %d\n", a, b, a*b);			//10 * 3 = 30
		System.out.printf("%d / %d = %d\n", a, b, a/b);			//10 / 3 = 3(몫)
		System.out.printf("%d %% %d = %d\n", a, b, a%b);		//10 % 3 = 1(나머지) //""안에서 %연산자를 사용하려면 %를 하나 더 붙여 이스케이프시킨다.
		System.out.println();
		
		double c = 10, d = 3;
		System.out.printf("%f / %f = %f\n", c, d, c/d);			//10.000000 / 3.000000 = 3.333333(몫)
		System.out.println();
		
		System.out.println(10 / 3);			//정수/정수, int/int -> int, 결과 3
		System.out.println(10.0 / 3.0);		//실수/실수, double/double -> double, 결과 3.333333~
		System.out.println(10.0 / 3);		//실수/정수, double/int -> double, 결과 3.333333~
		System.out.println(10 / 3.0);		//정수/실수, int/double -> double, 결과 3.333333~
		//System.out.println(100 / 0);		//error
		System.out.println(100 / 0.0);		//Infinity
		
		//*** 모든 산술 연산자의 결과 자료형은 >> 두 피연산자의 자료형 중 더 크기가 큰 자료형으로 반환된다.
		//연산할 때 버퍼오버플로우 발생 주의
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e+f);			//30억 > -1,294,967,296
		System.out.println((long)e + f);	//30억 3,000,000,000
		
		e = 300000;
		f = 500000;
		
		System.out.println(e*f); 			//-323855360
		System.out.println((long)e*f); 		//150000000000
		
		e = -2100000000;
		f = 1000000000;
		
		System.out.println(e-f);			//2094967296
		System.out.println(e - (long)f);	//-2200000000
		
		byte b1 = 10, b2 = 20, b3;
		//예외 사황 > byte, short 연산 결과는 무조건 int이다. 
		//byte + byte = byte(x), int(o)
		//short + short = short(x), int(o)
		
		//Type mismatch: cannot convert from int to byte
		//명시적 형변환 필요
		b3 = (byte)(b1 + b2);
		System.out.println();
		
		//*** 위와 같은 이유로 정수(int)를 사용한다. > byte, short를 거의 사용 안함
		
//		나머지 연산자(%)
//		- 패턴 (달력, 홀짝...)
		System.out.printf("%d %% %d = %d", 10,11,10%11);
		System.out.println(10 % 3);		//1
		System.out.println(10 % 4);		//2
		System.out.println(10 % 5);		//0
		System.out.println(10 % 10);	//0
		System.out.println(10 % 11);	//10
		System.out.println(10 % 2);		//0
		System.out.println(11 % 2);		//1
		
//		비교 연산자
//		논리 연산자
//		대입 연산자
//		증감 연산자
//		조건 연산자
//		비트 연산자
			
	}

}
