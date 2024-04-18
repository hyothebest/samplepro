package pack_thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ex3ThreadClock2 extends Frame implements ActionListener { //버튼클릭위한 액션리스너 implement
	Label lblMessage;
	
	public Ex3ThreadClock2() {
		lblMessage = new Label("show time", Label.CENTER); //line13에서 위치가 화면 가운데로 정해진 라벨 중에서 center로 가게 함. 대문자는 final, 누운글자는 static 의미
		add("Center", lblMessage); //화면 가운데
		
		Button btnClick = new Button("click here");
		add("South", btnClick);
		btnClick.addActionListener(this); //******this******
		
		setTitle("스레드 시계");
		setBounds(200, 200, 300, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); //무명클래스	
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			// 버튼 클릭 시 수행
			// System.out.println("와우");
			LocalDate date = LocalDate.now(); //싱글톤패턴 (now에 가면 LocalDate new햇을거)
			int y = date.getYear();
			int m = date.getMonthValue();
			int d = date.getDayOfMonth();
			
			LocalTime time = LocalTime.now();
			int h = time.getHour();
			int min = time.getMinute();
			int s = time.getSecond();
			
			String ss = y + "-" + m + "-" + d + "  " + h + ":" + min + ":" + s;
			lblMessage.setText(ss);
			lblMessage.setFont(new Font("Times new Roman", Font.BOLD, 20));
		}
	

	public static void main(String[] args) {
		// 스레드를 이용한 현재 날짜 및 시간 표시
		new Ex3ThreadClock2();	
	}

}
