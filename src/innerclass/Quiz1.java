package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz1 {

	public static void main(String[] args) {
		//화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);

		TextArea textArea = new TextArea("텍스트상자", 10, 50);
		frame.add(textArea);
		
		frame.setVisible(true);

	//미리 구현한 클래스로 키 이벤트 등록
		//1. FocusListener의 메서드 오버라이드한 자식 클래스의 인스턴스 매개변수로
//		textArea.addFocusListener(new MyFocusListener());
		//2. FocusListener 상속 받은익명클래스 이용 
		textArea.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!야호");
			}
			
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다!야호");
			} 
			
		});
	}
}

class MyFocusListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("텍스트에 포커스가 되었습니다!");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("텍스트에 포커스가 벗어났습니다!");
	}	
}
