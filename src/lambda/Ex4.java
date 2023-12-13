package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex4 {
/*
 * 람다식 함수 활용하기 (2)
 * */
	public static void main(String[] args) {
	
		// 문자열 리스트 생성
		List<String> list = new ArrayList<>(); // String 타입만 저장 가능
		
		// 문자열 추가
		list.add("add");
		list.add("ccc");
		list.add("bbb");
		
	// 리스트를 순서대로 정렬하기  -  Colletions.sort() : 리스트의 데이터를 순서대로 정렬
		// 1. 정렬 기준 제공하는 인터페이스 Comparator 익명클래스로 구현(오버라이드)해서 사용.  
		Collections.sort(list, new Comparator<String>() { // sort(a,b) - a를 b기준으로 정렬
													// 인자 : 문자열 리스트, 리스트 정렬하는 로직을 가지고 있
													// 		 리스트 정렬하는 로직을 가지고 있는 Comparator 클래스
			@Override
			public int compare(String o1, String o2) { //o1과 o2 두 문자열 비교해서 정렬 
				return o1.compareTo(o2); // 순정렬
//				return o2.compareTo(o1); // 역정렬
			}}); 
		System.out.println("리스트 순정렬" + list); // 저장한 순서(add, ccc, bbb와 다르게 출력)
		
		
		// 2. 람다식
		Collections.sort(list, (s1,s2) -> s1.compareTo(s2));
		// 사실 Collections.sort(list) 해도 순정렬이긴 하다. Comparator이용한 수동 정렬 보이려고 이렇게 한거다.
		System.out.println("리스트 순정렬" + list);
	}
}



