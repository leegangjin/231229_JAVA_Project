package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 읽어들여 map에 저장
		// 명단, 합계, 평균 출력
		// txt에서 읽어들이는 자료형은 스트링
		// 계산을 위해서는 인트 자료형으로 변환이 필요
		// Integer.ParseInt(); String -> int 로 변환
		
		HashMap <String,Integer> map = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		int sum = 0;
		
		while(true) {
			String line = br.readLine(); //한 라인 읽어오기
			if(line == null) {
				break;
			}
			String name =  line.substring(0,line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			sum+= score;
			map.put(name,score);
			
		}
		
		// br 끊기
		
		if (br != null) { // 닫히면 null이 나오는데 그렇지 않으면 닫기 (객체가 생성되었다면 끊기)
			
			br.close();
		}
		
		System.out.println(map);
		System.out.println("합계 : " +sum + " / " + "평균 : " + sum/map.size());
		System.out.println("---------------");
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("합계 : " +sum + " / " + "평균 : " + sum/map.size());
		
//		br.close();
		
	
	}

}
