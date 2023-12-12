/*
 * 내부클래스 종류와 제약사항 (1)
 * */

package innerclass.ex3;

public class Ex3 {

	public static void main(String[] args) {
		// 1. 인스턴스 내부 클래스의 인스턴스 생성 (인스턴스 내부 클래스 사용하기 위해서. 사실 내부클래스는 외부 클래스 안에서만 쓸목적으로 만든거지만, 문법상이렇게도 쓸 수 있음을 보여줌)  
		Outer outer = new Outer();
		
		Outer.InstanceInner instanceInner = outer.new InstanceInner(); // 내부 클래스의 객체 생성
		instanceInner.i1 = 300;  // 인스턴스 변수 사용
		instanceInner.i2 = 300;  // 정적변수 사용
		
		
		Outer outer2 = new Outer();
		Outer.InstanceInner instanceInner2 = outer2.new InstanceInner(); // 내부 클래스의 객체 생성
		instanceInner2.i1 = 400;  // 인스턴스 변수 사용
		instanceInner2.i2 = 400;  // 정적변수 사용 -> 정적변수는 외부클래스에 종속되기 때문에, 외부클래스 내부에서 공유해버림. 즉 외부 클래스 객체 다르더라도 , 정적변수는 공유 
	
		System.out.println("첫번째 인스턴스 내부클래스 : " + instanceInner.i1 + ", " + instanceInner.i2);
		System.out.println("두번째 인스턴스 내부클래스 : " + instanceInner2.i1 + ", " + instanceInner2.i2);

		
		// 2.정적 내부 클래스의 인스턴스 생성
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.i1 = 300;
		staticInner.i2 = 300;
	}
}


class Outer {

	// 인스턴스 클래스는 인스턴스변수와 정적변수를 모두가짐
	class InstanceInner {
		int i1 = 100; 
		static int i2 = 200; // 정적 변수
		// ㄴ 외부 객체 없이는 사용할 수 없기 때문에 정적변수는 사실상 외부 클래스에 종속됨. 내부 클래스가 아닌.
	}
	
	// 정적 클래스는  인스턴스 변수와 정적변수를 모두 가질 수 있음.
	static class StaticInner{
		int i1 = 100; 
		static int i2 = 200; // 정적 변수
		
	}
	
}
