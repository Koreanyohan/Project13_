/* 파일 목록 생성
 * String[] arr = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"}
 * 
 * 1. 파일 목록 중에서 txt 파일만 찾으세요.
 * 2. 확장자별로 파일의 개수를 구하세요.
 * 3. 파일의 확장자만 추출하여 출력하세요 (hint ! (.)점은 문자기호로 (\\.)으로 표현합니다.
 * */

package stream.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz02 {

	public static void main(String[] args) {
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };

//		1. 파일 목록 중에서 txt 파일만 찾으세요.
//		//내 풀이
//		Stream<String> stream1 = Stream.of(arr);
//		
//		List<String> list = stream1.collect(Collectors.toList());
//		
//		for (int i = 0 ; i< list.size() ; i++) {
//			if (list.get(i).contains(".txt")){
//				System.out.println(list.get(i));				
//			}
//		}

		Stream<String> stream11 = Stream.of(arr);
		stream11.filter(s -> s.endsWith(".txt")) // 문자열이 .txt로 끝나는지 확인. filter ()안에 return 숨어 있음. 즉, (s-> (return
													// s.endsWith(".txt"))
				.forEach(s -> System.out.print(s + " "));

		// 2. 확장자별로 파일의 개수를 구하세요.

//		// 내 풀이
//		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
//		for (int i = 0 ; i< list.size() ; i++) {
//			if (list.get(i).contains(".txt")){
//					sum1 = sum1 + 1;			
//			} else if (list.get(i).contains(".pdf")) {
//				sum2 = sum2 + 1;
//			} else if (list.get(i).contains(".img")) {
//				sum3 = sum3 + 1 ; 
//			}
//		}
//		System.out.println("txt 파일의 갯수 : " + sum1);
//		System.out.println("pdf 파일의 갯수 : " + sum2);
//		System.out.println("img 파일의 갯수 : " + sum3);
		System.out.println();
		Stream<String> stream221 = Arrays.stream(arr);
		long txtCount = stream221.filter(s -> s.endsWith(".txt")).count();
		Stream<String> stream222 = Arrays.stream(arr);
		long pdfCount = stream222.filter(s -> s.endsWith(".pdf")).count();
		Stream<String> stream223 = Arrays.stream(arr);
		long imgCount = stream223.filter(s -> s.endsWith(".img")).count();

		System.out.println("txt파일의 갯수 : " + txtCount);
		System.out.println("pdf파일의 갯수 : " + pdfCount);
		System.out.println("img파일의 갯수 : " + imgCount);

//		3. 파일의 확장자만 추출하여 출력하세요 (hint ! (.)점은 문자기호로 (\\.)으로 표현합니다.

		// 내 풀이
//		int length = list.size();
//		String[] list2 = new String[length];
//		
//		for (int i = 0 ; i<length; i++) {
//			int a = list.get(i).indexOf('.');
//			String b = list.get(i).substring(a);
//			
//			list2[i] = b;
//		}
//			
//		Stream<String> stream = Arrays.stream(list2);
//		stream.distinct().forEach(n -> System.out.println(n));

		Stream<String> stream33 = Arrays.stream(arr);

		stream33
		.map(s -> { 
			String[] strArr = s.split("\\."); // .을 구분자를 사용하여 문자열을 자름. 점2개면 배열 요소 3개 생김
			return strArr[1]; // strArr[0]은 잘린기준 왼쪽, [1]은 잘린기준 오른쪽
		})
		.distinct()
		.forEach(n -> System.out.print(n + " "));

	}

}
