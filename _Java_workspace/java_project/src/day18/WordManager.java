package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager {
	
	private HashMap<String,String>map =new HashMap<>();
	
	public void addWord() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("kiwi", "키위");
		map.put("orange", "오렌지");
		map.put("dog", "개");
	}
	
	public void insertWord(Scanner scan) {
		System.out.println("단어 >");
		String word =scan.next();
		System.out.println("의미 >");
		String mean =scan.next();
		
		map.put(word, mean);
		
	}
	public void modifyWord(Scanner scan) { //수정
		//map은 set이 없음 . remove => put
		//key 중복불가능 . put => 덮어쓰기
		System.out.println("수정할 단어 > ");
		String word =scan.next();
		if(map.containsKey(word)) {
			System.out.println("의미 >");
			String mean =scan.next();
			map.remove(word);
			map.put(word, mean);
			System.out.println("수정완료");
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}
	public void printWord() {
		int cnt=0;
		Iterator <String> it =map.keySet().iterator();
		while(it.hasNext()) {
			String key =it.next();
			cnt++;
			System.out.println(cnt+"."+key+":"+map.get(key));
			
		}
		
	}
	public void removeWord(Scanner scan) {
		System.out.println("삭제할 단어 >");
		String word =scan.next();
		String result =map.remove(word);
		if(result==null) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		System.out.println("삭제완료");
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 >");
		String word =scan.next();
		if(map.containsKey(word)) {
			System.out.println("--검색결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
		
	}
	
		
		
	

	public void fileWord() throws IOException {
		//StringBuffer 객체
				//.append : 기존 String에 데이터 추가 가능.
		//파일 출력
		FileWriter fs =new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		//sb.append : 기존 String 에 데이터 추가
		String data =null;
		sb.append("---단어장---");
		sb.append("\r\n"); //줄바꿈
		
		int cnt=0;
		
			for(String key : map.keySet()) {
				sb.append(key+":"+map.get(key));
				sb.append("\r\n"); //줄바꿈
				cnt++;
			}
			data = sb.toString(); //StringBuffer 객체여서 파일에 추가가되지 않는다. String 객체로 변환
			System.out.println(data);
			bw.write(data);
			if(bw!=null) {
				bw.close();
			}
			if(fs !=null) {
				fs.close();
			}
	}
				
				
	
	
	
 
	  
}

	
