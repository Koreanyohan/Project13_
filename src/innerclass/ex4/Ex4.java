/*
 * 내부클래스 종류와 제약사항 (2)
 * */

package innerclass.ex4;

public class Ex4 {

	public static void main(String[] args) {

	}
}

class Outer {

	void method() {
		int i = 100;

		class LocalInner {

			void innerMethod() {
				//i = 200; 변경불가. 사용은 가능.
				//따라서 메서드의 지역변수보다 객체의 생애주기가 더 길기 때문에,
				//지역변수는 값을 변경할 수 없도록 상수가 된다.				
				
			}
			
		}
		
	}

}
