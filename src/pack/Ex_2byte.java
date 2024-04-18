package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex_2byte {
	// 2byte 단위로 데이터 입출력: 문자열 데이터 처리 가능. 한글 자료에 효과적
	
	public void writeFile(File file, ArrayList<String> strdatas) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for(String s:strdatas) {
				bw.write(s, 0, s.length());
				bw.newLine(); // line skip
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("writeFile error: " + e);
		} 
	}
	
	public void readFile(File file) {
		try {
			StringBuffer sb = new StringBuffer();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String oneline;

			//String strs = null;
			//* 문자열 더하기가 많은 경우 아래 두 개의 클래스 중 하나를 추천
			//* StringBuilder builder = new StringBuilder();
			
			while((oneline = br.readLine()) !=null) {
				//* strs += oneline + "\n"; // 자바에서 문자열 더하기는 수십개 이상은 비권장함. 메모리 소모가 너무 커짐. immutable(수정 불가능)
				sb.append(oneline + "\n");
			}
			br.close();
			System.out.println(sb.toString());
		} catch (Exception e) {
			System.out.println("readFile error: " + e);
		} 	
	}
	
	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<String>();
		list.add("하하");
		list.add("호호");
		list.add("허허");
		
		File ff = new File("c:/work/iotest2.txt");
		Ex_2byte test2 = new Ex_2byte();
		test2.writeFile(ff, list);
		test2.readFile(ff);
	}
}
