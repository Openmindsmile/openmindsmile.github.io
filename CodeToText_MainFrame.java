import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//첫번째 화면- 로또 번호 입력화면

/*
----주요 버튼 이름----
MainFrame: 첫번째 창(패널을 클래스화 )
pnl : 첫 화면의 가장 큰 레이아웃

topPnl: 위쪽 레이아웃
lbl: 입력창인 것을 표시해주기 위한 라벨

middlePnl: 중간 레이아웃

bottomPnl: 아래 레이아웃
btnNext: 두번째 화면(확인창)으로 넘어가기 버튼
btnReset:(미구현) 텍스트 필드에 입력한 값을 초기화 하기 위한 버튼.!

 */
    



//메인프레임
public class CodeToText_MainFrame extends JPanel{
	// getter setter 만들기 위해 필드로 선언
	private JButton btnNext;
	private JButton btnReset;
	ArrayList<Integer> gameNumber1;
	ArrayList<Integer> gameNumber2;
	ArrayList<Integer> gameNumber3;
	ArrayList<Integer> gameNumber4;
	ArrayList<Integer> gameNumber5;
	
	


	///////서브 프레임에서 결정된 값을 접근하기 위한 getter 를 만들었다.  
	public ArrayList<Integer> getGameNumber1() {
		return gameNumber1;
	}

	public ArrayList<Integer> getGameNumber2() {
		return gameNumber2;
	}


	public ArrayList<Integer> getGameNumber3() {
		return gameNumber3;
	}

	public ArrayList<Integer> getGameNumber4() {
		return gameNumber4;
	}

	public ArrayList<Integer> getGameNumber5() {
		return gameNumber5;
	}
	////////////////////


	//생성자
	// 이 MainFrame안의 내용은 외우더라도 다 알도록 하기
	public CodeToText_MainFrame() {
		//큰 패널 
		JPanel pnl= new JPanel();
		
		//top
		JPanel topPnl = new JPanel();
		JLabel lbl= new JLabel("로또 번호를 6개 입력하세요 ");
		topPnl.add(lbl);
		BoxLayout blTop = new BoxLayout(topPnl, BoxLayout.X_AXIS);//글자 가로 배치 
		topPnl.setLayout(blTop);
		
		
		//middle
		JPanel middlePnl = new JPanel();
		//작은 패널 5개를 생성자로 불러 옴
		BigFrame bf1 = new BigFrame();
		BigFrame bf2 = new BigFrame();
		BigFrame bf3 = new BigFrame();
		BigFrame bf4 = new BigFrame();
		BigFrame bf5 = new BigFrame();
		/////
		middlePnl.add(bf1);
		middlePnl.add(bf2);
		middlePnl.add(bf3);
		middlePnl.add(bf4);
		middlePnl.add(bf5);
		BoxLayout blMiddle = new BoxLayout(middlePnl,BoxLayout.Y_AXIS);//입력패널 세로배치 
		middlePnl.setLayout(blMiddle);
		
		
		//bottom
		JPanel bottomPnl = new JPanel();
		//버튼-입력창으로 넘어간다. 
		btnNext = new JButton("제출하기");
		
		
		btnNext.addActionListener(new ActionListener() {//제출하기 눌렀을 때 gameNumber 이라는 배열을 생성!
			@Override
			public void actionPerformed(ActionEvent e) {//입력이 안 된 게임은 공백값을("") 가지는 배열이 된다. ([, , , , , ] <-이런 배열 ) -> 이걸 integer 형식으로 0으로 만들게 했다. 
				//입력 버튼을 안 누르고 제출 버튼을 누르면 아예 비워져있는 배열로 리턴한다. 
				
				// gameNumber라는 애들이 어떤 원소를 가지는 배열인지 알아야 한다.
				gameNumber1 = new ArrayList(bf1.getLastNumber());
				gameNumber2 = new ArrayList(bf2.getLastNumber());
				gameNumber3 = new ArrayList(bf3.getLastNumber());
				gameNumber4 = new ArrayList(bf4.getLastNumber());
				gameNumber5 = new ArrayList(bf5.getLastNumber());
				
//------------------------------------------------------
				
				
				bf1.comboToString();
				bf2.comboToString();
				bf3.comboToString();
				bf4.comboToString();
				bf5.comboToString();
				
				
				//확인용
				System.out.println(bf1.getLastNumber().toString()+"+"+ bf1.comboToString());
				System.out.println(bf2.getLastNumber().toString()+"+"+ bf2.comboToString());
				System.out.println(bf3.getLastNumber().toString()+"+"+ bf3.comboToString());
				System.out.println(bf4.getLastNumber().toString()+"+"+ bf4.comboToString());
				System.out.println(bf5.getLastNumber().toString()+"+"+ bf5.comboToString());
//--------------------------------------------------------------------------------------				
				
			}

						
		});
		
		
		
		
		//텍스트 필드에 입력한 모든 내용 초기화버튼
		btnReset = new JButton("리셋하기");
		
		//리셋했을 때, 배열을 모두 비우자!!
		//(문제)입력 > 리셋하고 다시 입력하였을 때 , 배열이 입력되어 있는 문제가 발생한다
		//(해결)입력 버튼을 눌렀을 때 , 최종으로 메인프레임에 반환하는 배열을 전부 0으로 리셋하고, 다시 값을 받는다. 
		// 좀 특이한 형태의 일회용 메소드
		// 버튼을 눌렀을때 어떤 숫자들이나 어떤 값 혹은 어떤 배열들이 튀어나오는지를 알아둬야 한다.
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 필드 입력부분을 전부 공백값으로 
				bf1.setReset();
				bf2.setReset();
				bf3.setReset();
				bf4.setReset();
				bf5.setReset();
				//입력 버튼을 누르면 저장하는 배열을 0으로 리셋한다. 
				bf1.setLastNumber(Arrays.asList(0,0,0,0,0,0));
				bf2.setLastNumber(Arrays.asList(0,0,0,0,0,0));
				bf3.setLastNumber(Arrays.asList(0,0,0,0,0,0));
				bf4.setLastNumber(Arrays.asList(0,0,0,0,0,0));
				bf5.setLastNumber(Arrays.asList(0,0,0,0,0,0));
				
				//★초기화를 해도 텍스트필드만 초기화가 되고, 앞에 콤보박스는 초기화가 되지 않는다. 
//				확인용
//				System.out.println(bf1.getLastNumber());
//				System.out.println(bf2.getLastNumber());
//				System.out.println(bf3.getLastNumber());
//				System.out.println(bf4.getLastNumber());
//				System.out.println(bf5.getLastNumber());
				
				
			}
		});
		
		
		// 여기까지!!
		
		bottomPnl.add(btnReset);
		bottomPnl.add(btnNext);
		BoxLayout blBottom = new BoxLayout(bottomPnl,BoxLayout.X_AXIS);//버튼 두개 가로배치
		bottomPnl.setLayout(blBottom);
		
		
		//큰 패널에 추가하기 
		pnl.add(topPnl);
		pnl.add(middlePnl);
		pnl.add(bottomPnl);
		add(pnl);
		
		
		
		BoxLayout box = new BoxLayout(pnl,BoxLayout.Y_AXIS);//전체적으로 세로로 쌓음 
		pnl.setLayout(box);
		
	}



	// 버튼 두 개를 반환하도록 getter를 설정했다.
	public JButton getBtnNext() {
		return btnNext;
	}

	public JButton getBtnReset() {
		return btnReset;
	}
}


//하나의 작은 패널 - 콤보박스, 텍스트필드 6개 ,입력버튼 


/*
tf1-6: 텍스트필드 6개 
getTextAll: 텍스트 필드에 입력된 텍스트를 String 값으로 가져 온 배열
strCombo: 콤보 박스 
smallBtn: 입력 버튼
(mainFrame에 넘기기 위한 최종 배열)lastNumber: getTextAll배열을  integer 값으로 변환하여 가져온 배열

-메소드-
random(): 랜덤 번호를 생성하여 string 값으로 반환한다. 
lookAndSet(인덱스,숫자): 텍스트필드에 랜덤값을 나타낸다.그 나타낸 랜덤값을 배열에 set해준다. 
loof(): lookAndSet()메소드를 하나하나씩 적용
comboToString() : 콤보 박스 선택한 결과를 string 으로 넘긴다.
setReset() :텍스트 박스 입력되는 부분을 공백으로 리셋하는 메소드 

 */





class BigFrame extends JPanel{
	// JUST 배열 ( ArryList가 아님)
	// 선택, 자동, 수동, 반자동이라는 String을 원소로 가지는 배열
	private String[] choice = {"선택", "자동", "수동", "반자동"};
	
	//메소드로 접근하기 위해 전역 변수로 선언했다. 
	// 숫자를 입력할 수 있도록 만든 한 칸 한 칸 짜리 텍스트필드
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	
	// 콤보박스의 이름이 strCombo
	private JComboBox strCombo;
	
	// 배열이 아닌 ArrayList
	List<String> getTextAll;
	
	// 위에서 본 getLastNumber의 그 lastNumber
	List<Integer> lastNumber;
	
	
	//텍스트 필드 입력 부분을 전부 공백으로 만드는 메소드 
	// 위에서 btnReset을 눌렀을때 동작하도록 만들면서, 처음 화면에 아무것도 안 뜨게 만들기 위해서 만들어놓은 메소드
	public void setReset() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
	}
	
// --------------------------------------------------------------

	//메인 프레임 클래스에서 접근하기 위한 getter를 만들었다. 
	public List<Integer> getLastNumber() {
		return lastNumber;
	}
	
	
	public void setLastNumber(List<Integer> lastNumber) {
		this.lastNumber = lastNumber;
	}


	//이건 생성자. - 여기는 배치만 있는거임. 
	public BigFrame() {
		//큰 레이아웃
		JPanel smallFrame = new JPanel();
		//콤보박스 추가
		strCombo = new JComboBox(choice);

		// 위에서는 선언만하고 만들어지지는 않았고,
		//텍스트필드 6개가 드디어 만들어졌다.
		// 3은 텍스트필드의 크기(눈에 보이는)
		tf1 = new JTextField(3);
		tf2 = new JTextField(3);
		tf3 = new JTextField(3);
		tf4 = new JTextField(3);
		tf5 = new JTextField(3);
		tf6 = new JTextField(3);

		//텍스트 필드에 입력된 텍스트를 String 값으로 가져 온 배열
		// getTextAll.add(tf1.getText());
		// 한 줄로 다 적기 위해서 asList를 사용했다.
		getTextAll = new ArrayList<>(Arrays.asList(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText(),tf6.getText()));
		
		//빈 배열 생성
		// 위에서 사용하기 전에 일단 초기화된 상태로 빈 배열을 만들어 놓은 것이다.
		lastNumber = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
		
		//입력 버튼
		JButton smallBtn = new JButton("입력");
		
		// 숫자가 아닌값은 입력하지 못하게 막아줌
		KeyListener keylistener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
					return;
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		};
		tf1.addKeyListener(keylistener);
		tf2.addKeyListener(keylistener);
		tf3.addKeyListener(keylistener);
		tf4.addKeyListener(keylistener);
		tf5.addKeyListener(keylistener);
		tf6.addKeyListener(keylistener);
		
		smallBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//스위치 케이스 문이 좀 더 쉽게 보이지 않을까???- 혜령의견
				
				//콤보 박스가 자동 일 떄. 
				String num = "";
				if (comboToString() == "자동") {
					int i = 0;
					while (true) {
						num = random();
						if (!getTextAll.contains(num)) {//랜덤번호가 중복되지 않는다면, 텍스트 필드에 랜덤값을 보여주고, 배열에 넣는다. 
							if (i ==6) {
								break;
							}
							lookAndSet(i, num);//배열에 랜덤값을 차례로 넣어줌
							i++;// 
						}
					}
				}
				
				/*getTextAll에 공백null값이 존재하는지 확인할수 있는거 */
				if (comboToString() == "반자동") {
					loop();//사용자가 텍스트필드에 입력한 값을 배열에 넣어주는 메소드 
					for (int i = 0; i<6; i++) {
						if ( getTextAll.get(i).equals("") ) {//텍스트 필드가 비워져 있으면 
							while (true) {
								num = random();
								if (!getTextAll.contains(num)) {//랜덤값을 중복되지 않게 텍스트 필드에 나타내고 , 배열에도 넣어주는 것. 
									lookAndSet(i, num);
									break;
								}
							}
						}
					}
				}
				//수동일 떄 
				if (comboToString() == "수동") {
					loop();//사용자가 텍스트필드에 입력한 값을 배열에 넣어주는 메소드 
				}
				
				
				//lastNumber 라는 배열에 
				//현재 텍스트 필드에 입력된 값을  받아서 integer 값으로 변환하였다. 
				for(int i =0; i<6; i++) {
					if(getTextAll.get(i).equals("")) {
						lastNumber.set(i,0);
					}else {
						lastNumber.set(i,Integer.valueOf(getTextAll.get(i)));
					}
					
				}
				
				//확인용
				//System.out.println(lastNumber);
				
				
				
				
				//입력 버튼을 누루면 메세지 창을 띄웁니다. 
	//			JOptionPane.showConfirmDialog(null,"입력한 번호를 확인하세요","사용자가 입력한 번호를 확인합니다. ",JOptionPane.YES_NO_OPTION);//yes는 0 리턴, no는 1리턴
			}
		});
		
		
		
		//레이아웃에 구성요소를 더해 준다. 
		smallFrame.add(tf1);
		smallFrame.add(tf2);
		smallFrame.add(tf3);
		smallFrame.add(tf4);
		smallFrame.add(tf5);
		smallFrame.add(tf6);
		smallFrame.add(smallBtn);
		add(strCombo);
		add(smallFrame);
		
		
		setSize(100,100);
		
	}
	
	// 어떤게 넘어오는지 알아야한다.
	// 콤보박스 선택을 스트링으로 넘겨주는 메소드
	public String comboToString() {
		if(strCombo.getSelectedItem().toString()=="자동") {
			return "자동";
		}else if (strCombo.getSelectedItem().toString()=="수동") {	
			return "수동";
		}else if(strCombo.getSelectedItem().toString()=="반자동") {
			return "반자동";
		}else {
			return "선택안함";
		}
	}
	

	//랜덤 번호를 생성하여 string 값으로 반환한다. 
	public String random() {
		Random random = new Random();
		int num = random.nextInt(45)+1;
		return String.valueOf(num);
	}
	
	//lookAndSet()메소드를 하나하나씩 적용 
	public void loop() {
		lookAndSet(0, tf1.getText());
		lookAndSet(1, tf2.getText());
		lookAndSet(2, tf3.getText());
		lookAndSet(3, tf4.getText());
		lookAndSet(4, tf5.getText());
		lookAndSet(5, tf6.getText());
	}
	
	//텍스트필드에 랜덤값을 나타낸다.그 나타낸 랜덤값을 배열에 set해준다.  
	public void lookAndSet(int index, String random) {
		if (index==0) {
			tf1.setText(random);
			getTextAll.set(0, random);
		} 
		if (index==1) {
			tf2.setText(random);
			getTextAll.set(1, random);
		}		
		if (index==2) {
			tf3.setText(random);
			getTextAll.set(2, random);
		} 
		if (index==3) {
			tf4.setText(random);
			getTextAll.set(3, random);
		}		
		if (index==4) {
			tf5.setText(random);
			getTextAll.set(4, random);
		} 
		if (index==5) {
			tf6.setText(random);
			getTextAll.set(5, random);
		}
	}
	
	
}