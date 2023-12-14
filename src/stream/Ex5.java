package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 패키지 여행을 떠나는 고객 정보를 저장하는 Customer 클래스를 만든다.
 * 속성: 이름,나이,여행비용
 * 
 * 여행 고객 리스트를 만들고, 고객을 추가한다.
 * (둘리, 40살, 여행비용 100만원), (또치, 13살, 여행비용 50만원), (도우너, 25살, 여행비용 70만원)
 * 
 * 고객 리스트를 사용하여 다음과 같은 정보를 출력한다.
 * - 고객의 명단
 * - 여행의 총 비용
 * - 20세 이상의 고객을 찾아서 이름을 출력
 * */
public class Ex5 {

	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		// 제너릭이 객체인 Customer타입. 따라서 참조변수나 new 연산자 동반한 생성자 넣어야.
		
		Customer customer1 = new Customer ("둘리", 40 , 100);
		Customer customer2 = new Customer ("또치", 13 , 50);
		Customer customer3 = new Customer ("도우너", 25 , 70);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println(customerList);
		
 	// 고객의 명단 스트림 만들기
		Stream<Customer> stream1 = customerList.stream();

		// 1. map 중간연산자(데이터 변환) 이용해서 이름만 출력
		stream1 
		.map(c->c.name) // 스트림에 있는 요소인 객체를 이름으로 바꿈.
		.forEach(s -> System.out.println(s)); 
		
		// 2. 모든 고객의 총 예산 -> 객체배열 소스로하는 스트림(Stream)메서드로는 불가능.그래서 기초형으로바꿔
		Stream<Customer> stream2 = customerList.stream();
		
		int sum = stream2.mapToInt(c->c.budget).sum(); 
//stream2에서 객체의 budget만 추출해서 새로운 int형 기본자료형 스트림만듬. 참고로 mapToInt(c->c.budget)이후에 값 하나만 
//남아서 좌항 int로 저장한거. 2개 이상 남았으면 아니였으면 intStream에 저장했겠지
		System.out.println("고객의 총 예산 : " + sum);
	
		// 3. 20세 이상 고객 명단
		System.out.print("20세 이상 고객 : ");
		Stream<Customer> stream3 = customerList.stream();		
		stream3
			.filter(c -> c.age >= 20)
			.map(c->c.name)
			.sorted() // 가나다 순 정렬
			.forEach(s->System.out.print(s + " "));
	}
}

// 고객 클래스
class Customer {
	String name ; //이름
	int age ; // 나이
	int budget ; // 여행비용
	
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "고객 정보 [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}	
}