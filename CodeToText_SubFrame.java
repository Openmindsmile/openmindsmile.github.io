
import java.awt.CardLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
//화면 두개 넘어가도록 만듬


//커밋테스트

//CardLayout 으로 창 전환하도록 만드는 클래스
public class CodeToText_SubFrame extends JFrame {

	//여기서 구현
	public CodeToText_SubFrame() {
		super("3일차");
		CardLayout layout = new CardLayout();
		JPanel center = new JPanel(layout);
		
		//첫 번째 창-생성자로 불러옴
		JPanel mainframe = new MainFrame();
		//두 번째 창- 생성자로 불러옴 
		JPanel subframe = new SubFrame();
		
		//두 창을 넘길 수 있게 셋팅하기
		center.add(mainframe,"입력창");
		center.add(subframe,"확인창");
		
		//입력창이 기본으로 뜨도록 셋팅
		layout.show(center, "입력창");
		add(center);

		
		//버튼 누르면 다른 페이지 넘어가도록 actionlistener 객체를 생성하였다. 
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// if로 이름이 같은 버튼에 액션이 생기면 레이아웃을 이전이나 다음으로 옮겨준다.
				if(e.getActionCommand().equals("제출하기")) {
					//첫번째화면 -> 두번째 화면으로
					layout.next(center);
				} else if(e.getActionCommand().equals("다시 입력하기")) {
					//두 번째 화면 -> 첫 번쨰 화면으로
					layout.previous(center);
				} else if( e.getActionCommand().equals("종료하기")) {
					// 종료하도록 만들어준다.
					dispose();
				}
			}
		};

		//버튼에 액션리스너 설정 
		 ((MainFrame) mainframe).getBtnNext().addActionListener(listener);
		 ((MainFrame) mainframe).getBtnReset().addActionListener(listener);
		
		((SubFrame) subframe).getBtnReset2().addActionListener(listener);
		((SubFrame) subframe).getBtnEnd().addActionListener(listener);
		
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new CodeToText_SubFrame().setVisible(true);
		
		//System.out.println("태한push확인");
	}
}