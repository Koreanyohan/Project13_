/* 객체클래스 만들고 외부 클래스 요소 사용하기
*/

package innerclass.ex1;


class A {
	int num = 10;

	class B {
		void method() {
			A a = new A();
			System.out.println(a.num);
		}
	}
}