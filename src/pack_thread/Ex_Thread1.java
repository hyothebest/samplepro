package pack_thread;

public class Ex_Thread1 extends Thread{
	public Ex_Thread1() {}
	
	public Ex_Thread1(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.print(i + " " + getName() + " "); 
			// 어느 스레드 꺼가 나오나 확인해보자;
		}
	}
	
	public static void main(String[] args) {
		try {
			Ex_Thread1 th1 = new Ex_Thread1("one");
			th1.start();
			Ex_Thread1 th2 = new Ex_Thread1("two");
			th2.start();			
			System.out.println("프로그램 종료");			
		} catch (Exception e) {}
	}
}
