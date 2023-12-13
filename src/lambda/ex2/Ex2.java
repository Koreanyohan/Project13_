package lambda.ex2;

public class Ex2 {

	public static void main(String[] args) {
		// 메서드를 람다식으로 구현
		// Calc calc = (x,y) -> x+y;
		
		// 컴파일러는 람다식을 익명클래스로 변환하고, 클래스의 인스터스를 생성한다
		
		Calc calc = new Calc() { // 여기까지 쓰고 Calc()에 마우스 올리고 add unimplemented method 눌러

			@Override
			public int add(int num, int num2) {
				return num + num2;
		} };
		System.out.println(calc.add(3, 5));
	}
}

// 함수형 인터페이스  선언
@FunctionalInterface
interface Calc {
	int add (int num, int num2);
}