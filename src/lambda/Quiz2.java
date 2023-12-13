package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		// 1.1. 인스턴스의 익명 클래스 사용
		Hello hello1 = new Hello() {

			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello1.helloPrint(); // 참조변수로 익명클래스 내부의 메서드 호출
		
		// 1.2. Quiz - 위에거 람다식으로 변경
		
		Hello hello2 = ()-> {System.out.println("안녕하심까");};
		hello2.helloPrint();
		
		// 2. 구현 클래스 사용
		Hello hi = new HelloImpl (); // 좌항에 그냥 인터페이스 구현한 클래스 써도됨 (HelloImpl hi = ~)
		hi.helloPrint();
		
	}
}

// 함수형 인터페이스 선언
interface Hello {
	void helloPrint(); // 추상 메서드 선언
}

class HelloImpl implements Hello {
	@Override
	public void helloPrint() {
		System.out.println("안녕하쇼");		
	}	
}
