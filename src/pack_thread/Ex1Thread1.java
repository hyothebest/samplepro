package pack_thread;

public class Ex1Thread1 extends Thread{ //Thread는 java.lang에 있는 패키지는 기본 클래스이므로 import할 필요없음
	public Ex1Thread1() {}
	
	public Ex1Thread1(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=50; i++) {
			//System.out.print(i + " ");
			System.out.print(i + ":" + getName() + " "); // 어느 스레드 꺼가 나오나 확인해보자
		}
	}
	
	public static void main(String[] args) {
		try {
			// 3. 사용자 정의 thread를 사용한 경우: 랜덤하게 실행
			Ex1Thread1 th1 = new Ex1Thread1("one");
			th1.start(); // start가 run을 시작하도록 함
			Ex1Thread1 th2 = new Ex1Thread1("two");
			th2.start();
			// 두 개의 작업을 동시에 실행하는 것처럼 느끼게 함
			
			th2.setPriority(MAX_PRIORITY); //스레드 스케쥴러에게 최대 우선 순위 요청(Max 10. min 1). 확률을 높일 뿐 무조건 요청 승인되진 않음
			th1.join(); //th1 스레드가 종료될 때까지 main스레드의 종료를 대기
			th1.yield(); //다른 스레드의 수행 요청이 들어오면 현재 스레드의 수행를 일시정지
			
			
			System.out.println("\n프로그램 종료");
			// 스레드 총 3개. th1.start()랑 th2.start()랑 print
	
			
		} catch (Exception e) {
			System.out.println("너임마" + e);
		}	
	}
}
