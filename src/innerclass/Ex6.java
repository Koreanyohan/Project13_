// 일반클래스 사용   vs Ex7
package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//awt : 화면 기반 어플리케이션을 개발하기 위한 라이브러리이다. (우리는 스프링배울거라 필요없는데 익명클래스때매 여기서 언급)

public class Ex6 {

	public static void main(String[] args) {
		// 1. 화면 만들기
		Frame frame = new Frame(); // Frame : 창
		frame.setLayout(new FlowLayout()); // 창 배치방식
		frame.setBounds(500, 300, 500, 300); // 창의 위치와 크기 결정
		frame.setVisible(true); // 프레임 화면에 보이게

		// 2. 버튼 만들기
		Button button = new Button("Click");
		frame.add(button);

		// 3. 버튼 이벤트 등록하기
		// 3.1 ActionListener의 메서드 구현한 EventHandler인스턴스 사용
		// button.addActionListener(new EventHandler()); //미리 구현한 클래스를 사용하여 객체 생성
		// 3.2 ActionListener 구현하는 익명 클래스 사용
		button.addActionListener(new ActionListener() { // 익명클래스 - 일회용

			@Override // ActionListener로부터 오버라이드
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다....");
			}

		});
	}
}

class EventHandler implements ActionListener {

	@Override // ActionListenr에서 오버라이드
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");
	}
}
