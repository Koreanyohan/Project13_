/*
 * String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};
 * 
 *  1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요.	3
 *  2. 모든 문자열의 길이를 더한 합을 구하세요.		13
 *  3. 가장 길이가 짧은 문자열의 길이를 구하세요  	1
 *  4. 중복을 제거한 리스트를 만드세요.			[aaa, b, ccccc]
 * */

package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Quiz01 {
	public static void main(String[] args) {
		String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};		
		
		// 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요.
		Stream<String> str = Stream.of(arr); // = Arrays.stream(arr)
		long a = str
		.filter(n -> n.length()>2)
		.count();
		System.out.println(a); // cf ) count는 많은 값 나올걸 대비해서 long으로 반환.
		
		// 2. 모든 문자열의 길이를 더한 합을 구하세요.
		Stream<String> str2 = Stream.of(arr);
		int sum = str2.mapToInt(c->c.length()).sum(); //mapToInt의해서 기초자료형 스트림됨. 값 한개만 남아서 좌항에 int. 2개이상 남았었으면 IntStream이 좌항이었어야.
		System.out.println(sum);	
		
	// 3. 가장 길이가 짧은 문자열의 길이를 구하세요.
		// 풀이 3-1.
		Stream<String> str3 = Stream.of(arr);
		str3
		.map(n-> n.length())
		.sorted() // 오름차순 정렬
		.limit(1) // 오름차순 정렬에서 첫번째 요소만 두고 자름.
		.forEach(s->System.out.println(s));  // .forEach(System.out::print)
		
		// 풀이 3-2.
		Stream<String> stream4 = Arrays.stream(arr);
		OptionalInt optionalInt = stream4
		.mapToInt(s->s.length())
		.min();
		System.out.println(optionalInt.getAsInt());
		
		// 4. 중복을 제거한 리스트를 만드세요.
		Stream<String> str4 = Stream.of(arr);
		List<String> list = str4.distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}













