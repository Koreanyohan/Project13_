/* 12월 13일
 * 스트림 만들기
 * */

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {

		// 리스트 생성
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

	//	List<Integer> list2 = new ArrayList<>(); // 위와 같다.
	//	list2.add(1);
	//	list2.add(2);
	//	list2.add(3);
	//	list2.add(4);
	//	list2.add(5);

		// 리스트로부터 스트림 생성하기 - 스트림과 리스트는 메모리 영역이 별개라, 한쪽에서 수정해도 서로 영향 없다.
		Stream<Integer> stream1 = list.stream();

		// 객체 배열로부터 스트림 생성하기
		String[] strArr = { "a", "b", "c" };

		Stream<String> stream2 = Stream.of(strArr); // Stream 클래스의 of 메서드 사용
		Stream<String> stream3 = Arrays.stream(strArr); // Arrays 클래스의 stream 메서드 사용

		// 기초 배열로부터 스트림 생성하기
		int[] intArr = { 1,2,3,4,5};
		
		// Stream<Integer>가 아니라 IntStream(기본형 스트림)이 반환됨
			// Stream<Integer>은 속도가 느림. 꺼낸후에 언박싱해서. 기본형 스트림은 언박싱 다 해서 넣음.
			// 기본형 스트림이 메서드가 더 많다.  ex ) sum(배열 내의 요소 합), max (배열 내 요소 중 최대값)
		IntStream stream4 = Arrays.stream(intArr);
		
		
	}
}



