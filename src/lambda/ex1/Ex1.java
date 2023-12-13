// 12월 13일 
package lambda.ex1;

public class Ex1 {

	public static void main(String[] args) {
		
		// 람다식으로 함수형 인터페이스 Calc를 구현 (오버라이드)
		Calc calc = (x,y) -> x+y;
		
		
		// 인터페이스 변수로 메서드 호출
		System.out.println(calc.add(3, 5));

	}
	

}

// 함수형 인터페이스 
@FunctionalInterface // Annotation - 1. 기능 ex)@FunctionalInterface - 추상메서드 1개 초과시 컴파일 에러  2. 의미만 
interface Calc {
	int add (int num1, int num2);
//	int add2 (int num1, int num2);  // @FunctionalInterface 때매 추상 메서드 2개 이상 못옴.
}

