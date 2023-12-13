/*
 * 스트림의 연산 - 중간연산
 * */
package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
// 리스트 생성
		List<Integer> list = Arrays.asList(1,1,2,3,5,4);

							//리스트로부터 스트림 생성
		Stream<Integer> stream1 = list.stream();// 스트림에 숫자저장되서 Stream 제너릭스 Integer
		
		
	// 1. 중간연산으로 중복을 제거하고 출력  - distinct
		stream1
			.distinct() // 중복제거하는 중간연산자 ( 1,1 -> 1)
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println("(1번)");
	// 2. 중간 연산으로 2의 배수만 추출 - filter						
		Stream<Integer> stream2 = list.stream(); // 새로운 스트림

		stream2
			.filter (n -> n%2 == 0) // 스트림에서 짝수만 걸러내서 스트림 구성 0->1 하면 홀수만 거름
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println("(2번)");		
	// 3. 중간연산으로 요소를 3개만 출력 - limit
		Stream<Integer> stream3 = list.stream(); // 새로운 스트림
		stream3
			.limit(3) // 요소의 갯수 3개만 냅두고 잘라냄
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println("(3번)");		
	// 4. 중간연산으로 순서대로 정렬하고 출력 - sorted
		Stream<Integer> stream4 = list.stream();
		stream4
			.sorted()  // 순정렬
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println("(4번)");		
	// 5. 중간연산으로 역순으로 정렬하고 출력 - sorted(Comparator.reverseOrder())
		Stream<Integer> stream5 = list.stream();
		stream5
			.sorted(Comparator.reverseOrder())
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println("(5번)");
	// 6. Stream<Integer>을 기본형 스트림 IntStream 을 변경
		Stream<Integer> stream6 = list.stream();
		
		IntStream intStream = stream6.mapToInt(n -> n.intValue()); 
    	//stream6 스트림이 Integer자료형이지. 요소들 전부 int형으로 만들어서 IntStream의 참조변수에 주소값 대입
		
		System.out.println(intStream.sum()+ "(6번)"); // 기본형 스트림의 sum 메서드
		
		//Stream클래스는 sum, count 같은 함수를 사용할 수 없음.
				
	// 7. 중간연산으로 요소를 대문자로 변경하고 출력 - map
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc"); // 리스트 생성
		Stream<String> stream7 = strList.stream();
		stream7
			.map(s->s.toUpperCase()) // 대문자로 요소 변경
			.forEach(s -> System.out.println(s + " "));
	
		System.out.println("~(7번)");
	// 8. 중간연산으로 요소의 값을 문자열의 길이로 변경하고 출력
		List<String> strList2 = Arrays.asList("aaa", "bbbb", "ccccc"); // 리스트 생성
		Stream<String> stream8 = strList2.stream();
		
		stream8
			.map(s -> {
				int length = s.length();
				return length;})
			.forEach(s -> System.out.print(s + " "));		
		
		System.out.println("(8번)");
	}
}

















