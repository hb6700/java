//Ex20_Method.java
package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		/*
		메소드 인자 리스트
		- 인자 = 파라미터 = 매개변수
		
		*/
		
//		요구사항) '홍길동'에게 인사를 하는 메소드를 구현하시오.
//		추가사항) '아무개'에게 인사를 하는 메소드를 구현하시오.
		hello();
		hello2();
		hello3();
		helloEveryOne("홍길동");
		helloEveryOne("아무개");
		helloEveryOne("하하하");
		
		checkAge(15);
		checkAge(25);
		
		checkScore("홍길동", 100, 90, 80);	//실인자
		//매개변수 개수가 일치해야함
		//checkScore("하하하", 70, 90);				//(X)
		//checkScore("하하하", 70, 90, 80, 100);	//(X)
	}//main
	
	public static void hello() {
		System.out.println("홍길동 님 안녕하세요.");
	}//hello
	
	public static void hello2() {
		System.out.println("아무개 님 안녕하세요.");
	}//hello2
	
	public static void hello3() {
		System.out.println("하하하님 안녕하세요.");		
	}//hello3
	
	public static void helloEveryOne(String name) {
		System.out.printf("%s 님 안녕하세요.\n", name);
	}//helloEveryOne
	
	public static void checkAge(int age) {
		String result = age >= 19 ? "성인" : "미성년자";
		System.out.printf("%d살은 %s입니다.\n", age, result);
	}//checkAge
	
	//가인자
	public static void checkScore(String name, int kor, int eng, int math) {
		//총점 250점 이상 합격
		int total =0;
		total = kor + eng + math;
		String result = total >=250 ? "합격" : "불합격";
		System.out.printf("%s 학생: %d점 = %s\n", name, total, result);
	}//checkScore
	
}
