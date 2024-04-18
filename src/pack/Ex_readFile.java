package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class Ex_readFile {
	public static void main(String[] args) throws Exception {
		// 파일 읽기
		// File f = new File("c:/work/good.txt"); 또는
		File ff = new File("c:\\work\\good.txt");
		// 문자 단위
		FileReader fr = new FileReader(ff);
		BufferedReader br = new BufferedReader(fr); 
		//하드디스크로부터 데이터를 읽는 작업은 많은 시간을 소모하므로 가능한 하드디스크와 같은 물리적인 장치와의 접속 횟수를 줄이는 게 좋음
		//버퍼는 메모리에 생성되는 임시 기억 장소로써, 하드디스크에 한 번 접속할 때 버퍼크기만큼 데이트를 한꺼번에 읽어 메모리에 올려놓고 처리하면 데이터 처리 속도가 개선됨
		while(true) {
			String ss = br.readLine();
			if(ss == null) break;
			System.out.println(ss);
		}
		br.close(); //garbage collector(gc)로 하여금 점유메모리 해제 요청
		fr.close();	
		
		System.out.println("전국 도서관 정보 파일 일부 읽기");
		File f = new File("c:/work/korealib");
		FileReader fr2 = new FileReader(f);
		BufferedReader br2 = new BufferedReader(fr2);
		int cnt = 0;
		while(true) {
			cnt++;
			String ss = br2.readLine();
			if(ss == null || cnt>= 10) break;
			StringTokenizer st  = new StringTokenizer(ss,",");
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			String s3 = st.nextToken();
			String s4 = st.nextToken();
			System.out.println(s1+ " " + s2 + " " + s3 + " " + s4);
		}
		System.out.println("건수:");
		
		
		
		
		
	}
}
