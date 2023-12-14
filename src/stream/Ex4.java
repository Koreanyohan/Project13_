/*
 * 스트림의 연산 - 최종연산
 * */

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		// 배열 생성 
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		// 배열에서 기본형 스트림 생성
		
	// Stream<Integer>(객체배열 소스로 하는 스트림) -> IntStream (기본형 배열을 소스로 하는 스트림)
		IntStream stream1 = Arrays.stream(intArr); // = stream.of(intArr);
		
		// 지정된 반복 작업을 수행
		stream1.forEach(n -> System.out.print(n + " "));
				// ㄴ void accept(int value){System.out.print(n)};
				// forEach 매개변수 IntConsumer -> 가진 함수가 void accept(int value)
		
		System.out.println();
		// 1. 스트림 요소의 개수 구하기 - 이건 객체배열 소스로 하는 스트림에도 있다. 
		IntStream stream2 = Arrays.stream(intArr);
		System.out.println("요소의 갯수 : " + stream2.count());
		
	      // 객체배열 소스로하는 스트림도 count() 중간연산자 됨.
			//		Stream<Integer> str = Stream.of(1,2,3); 
			//		System.out.println("요소의 갯수 : " + str.count()); 
		
		// 2. 스트림 요소의 합 구하기 - 기본형 스트림에만 있음.
		IntStream stream3 = Arrays.stream(intArr);
		System.out.println("요소의 합 : " + stream3.sum());
		
		// 3. 초기값을 넣고, 반복 작업 수행
		IntStream stream4 = Arrays.stream(intArr);
		
		int result = 				
				stream4.reduce(10, (total, n) -> total + n);
				// reduce - 초기값 가지고 반복 작업 실행.
				//  int reduce(int identity(초기값), IntBinaryOperator op(실행문);
		System.out.println(result);
		
		
		// 4. 리스트 생성
		List<Integer>list = Arrays.asList(1,2,3,4,5);
		
			// 스트림을 set으로 변경
		Stream<Integer> stream5 = list.stream();
		Set<Integer> set = stream5.collect(Collectors.toSet()); //스트림->set
		System.out.println(set);
		
			// 스트림을 list로 변경
		Stream<Integer> stream6 = list.stream();
		List<Integer> strList = stream6.collect(Collectors.toList()); //스트림->list
		System.out.println(strList);
	}
}
