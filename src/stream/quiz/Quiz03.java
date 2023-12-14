/*
 * 1. 모든 거래번호를 한줄에 나열하세요. * 
 * 2. 2022년도의 거래 총금액과 건수를 출력하세요. * 
 * 3. 2023년도의 거래 총금액과 건수를 출력하세요.
 * */
package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz03 {

	public static void main(String[] args) {
		// 거래내역 리스트 생성
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, 2022, 100));
		list.add(new Order(1002, 2022, 200));
		list.add(new Order(1003, 2022, 300));
		list.add(new Order(1004, 2023, 400));
		list.add(new Order(1005, 2023, 500));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 700));	
		
		// 1. 모든 거래번호를 한줄에 나열하세요. * 		 
		Stream<Order> intstream1 = list.stream();
		intstream1
		.map(n->n.orderNo)
		.forEach (n-> System.out.print(n + " "));
		
		System.out.println();
		// 2. 2022년도의 거래 총금액과 건수를 출력하세요.
		Stream<Order> intstream2 = list.stream();
		int a = intstream2
				.filter(n-> n.year==(2022))
				.mapToInt(n->n.price) // 반환값 IntStream
				.sum(); // 반환타입 int다
		System.out.println("2022년 총금액 : " + a);
		
		Stream<Order> intstream3 = list.stream();
		long b = intstream3
				.filter(n-> n.year==2022)
				.count(); // 반환타입 long이다
		System.out.println("2022년 건수 : " + b);
		
		
		// 3. 2023년도의 거래 총금액과 건수를 출력하세요. 
		Stream<Order> intstream4 = list.stream();
		int c = intstream4
				.filter(n-> n.year==(2023))
				.mapToInt(n->n.price)
				.sum();
		System.out.println("2023년 총금액 : " + c);
		
		Stream<Order> intstream5 = list.stream();
		long d = intstream5
				.filter(n-> n.year==2023)
				.count();
		System.out.println("2023년 건수 : " + d);		
	}
}

// 쇼핑몰 거래내역 클래스
class Order {
	
	int orderNo; // 주문번호
	int year ; // 주문연도
	int price; // 거래금액 (만원)
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}	
}