package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex7 {

	public static void main(String[] args) {
		//1. 화면 만들기
			Frame frame = new Frame(); // Frame : 창
			frame.setLayout(new FlowLayout());  //창 배치방식
			frame.setBounds(500, 300, 500, 300); // 창의 위치와 크기 결정
			frame.setVisible(true); // 프레임 화면에 보이게
				
		
		// 2.1 일반클래스 인스턴스로 이벤트 등록하기
//			frame.addKeyListener(new MyKeyListener()); // 자식 클래스의 객체 생성
		
		// 2.2 KeyAdapter구현하는 익명클래스로 키 이벤트 등록
			frame.addKeyListener(new KeyAdapter() { // 익명 클래스(부모클래스 참조) 의 객체 생성. ('부모의 이름'사용해서 자식 클래스 만드는(오버라이드해서) 느낌. 재정의)
				public void keyPressed (KeyEvent e) {  
					System.out.println("키를 눌렀습니다!!");
					// 마치 부모에게 물려받은 메서드 오버라이드
				}
			});
	}
}

class MyKeyListener extends KeyAdapter {

	@Override // KeyAdapter에서 오버라이드
	public void keyPressed(KeyEvent e) {  // -> 키 누르면 출력
		System.out.println("키를 눌렀습니다!");
	}	
}
