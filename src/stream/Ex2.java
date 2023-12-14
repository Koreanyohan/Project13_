/*
 * 스트림의 특징
 * */

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
	public static void main(String[] args) {
	// * 리스트 생성
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3); // 배열 -> 리스트

	// 1. 스트림 생성
		Stream<Integer> stream = list.stream(); // Collection의 stream메서드로 스트림 생성
		// 리스트 안에 값을 하나씩 출력
		stream.forEach(n -> System.out.print(n)); // 스트림의 요소(n)에 대해 반복작업

//		long count = stream.count(); // 위에서 Stream의 forEach 최종연산으로 스트림(stream) 닫힘.
		System.out.println();
		
	// 2. 새로운 스트림 생성
		Stream <Integer> stream2 = list.stream();
		
		List<Integer> sortedList = stream2.sorted().collect(Collectors.toList()); 
		// collect(자료형) -> 해당자료구조로 변경 (최종연산자) cf_Collectors.joining() : String으로 변경
	
		System.out.println(list); // 원본데이터는 스트림 생성해도 변화 없다.
		System.out.println(sortedList); 
		
	// 3. 새로운 스트림 생성
		Stream <Integer> stream3 = list.stream();
		stream3
			.filter(n -> n>=3).sorted()
			// ㄴ filter 중간연산으로 3보다 큰 값만 걸러 스트림 구성 / sorted 중간연산으로 순정렬
			.forEach(n->System.out.print(n)); // 최종연산 -> 스트림 닫힘.
 
	// 4. 새로운 스트림 생성
		Stream<Integer> stream4 = list.stream();
		Stream<Integer> stream5 = stream4.filter(n -> n>3);
		Stream<Integer> stream6 = stream5.sorted(); // stream4.filter(n -> n>3).sorted();
	}
}























