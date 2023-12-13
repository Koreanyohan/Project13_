package lambda;

/*
 * 다음 코드를 람다식으로 변경하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
	// 1.1. 구현 클래스 사용
		MyNumber number1 = new MyNumberImpl(); //좌항에 그냥 인터페이스 구현한 클래스 써도됨 MyNumberImpl()~
		System.out.println(number1.max(10, 20));
		
	// 1.2. 람다식 함수 사용
		MyNumber number2 = (x,y) -> 
			x > y ? x: y;	// 한 줄로
		//	{int max = x> y ? x: y;
		//	return max;}  // 두 줄로
			System.out.println(number2.max(10, 20));	
		
	// 2. 인터페이스의 익명클래스 사용	
		MyNumber number3 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}			
		};
		System.out.println(number3.max(10, 20));		
	}
}

//함수형 인터페이스 선언
interface MyNumber {
	// 더 큰 값을 구하는 메서드 선언
	int max (int x, int y);
}

class MyNumberImpl implements MyNumber {
	// 삼항 연산자 사용
		@Override
		public int max(int x, int y) { // 반환타입 int
		int max = x > y ? x : y;
		return max;	
		}

// 조잡한 내 풀이
//	@Override
//	public int max(int x, int y) {
//		int a = 0;
//		if (x>y) {
//			a = x;
//		}else if (x<y) {
//			a = y;
//		} else{
//		a = x;}
//		return a;	
	
}


