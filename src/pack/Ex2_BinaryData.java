package pack;

import java.io.Serializable; // 주로 네트워크 상에서 자료 전송 및 수신 시 이진 데이터로 처리하는 인터페이스

public class Ex2_BinaryData implements Serializable{
	int a = 90;
	double b = 123.456;
	String s1 = "Korea";
	String s2 = "대한민국";
}
