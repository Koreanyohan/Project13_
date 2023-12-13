package lambda;

public class Ex3 {

	public static void main(String[] args) {
		// 1. 인터페이스(StringConcat) 구현하는 인스턴스 사용 (new StringConcatImpl()) - 객체지향 프로그래밍 방식
		StringConcat concat1 = new StringConcatImpl() ;
		concat1.makeString("Hello", "World");
		
		
		// 2.1 인터페이스의 익명클래스 사용
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println( s1 + "," + s2);		 
			}			
		};
		concat2.makeString("Hello", "World");
		
		// 2.2 람다식 사용 - 함수 프로그래밍 방식
		StringConcat concat3 = (s1,s2) ->  System.out.println( s1 + "," + s2);
		concat3.makeString("Hello", "World");
	}
}

@FunctionalInterface
interface StringConcat{
	// 두 문자열을 연결하는 메서드 선언
	public void makeString(String s1, String s2);
	
//	public void makeString2(String s1, String s2); // 함수형 인터페이스 아니게 되서 람다식으로 못 받음.
}

class StringConcatImpl implements StringConcat{
	@Override
	public void makeString(String s1, String s2) {
		System.out.println( s1 + "," + s2);				
	} // 인터페이스 구현하는 클래스 이름에 Impl 붙이곤 함.	
}
