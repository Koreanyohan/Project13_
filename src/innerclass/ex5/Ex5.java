package innerclass.ex5;

/*
 * 내부클래스 종류와 제약사항 (3) (제약사항이라기 보다 장점.)
 * */

public class Ex5 {

	public static void main(String[] args) {
	

	}
	
}


class Outer {
	private int a  = 10; // 접근제어자를 private로 지정
	private static int b = 20;
	
	class InClass {
		int i1 = a; // 내부클래스는 외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}
	
	static class InStaticClass {
		int i2 = b;
	}
}