package day17;

import java.util.ArrayList;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/*  두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 정렬하여 출력
		 * 
		 * 
		 */
		ArrayList<String> st =new ArrayList<String>();
		String arr1[]= new String[] {"a","c","f","b"};
		String arr2[]= new String[] {"d","g","h","k"};
		for(int i=0; i < arr1.length; i++) {
			st.add(arr1[i]);
		}
		for(int i=0; i < arr2.length; i++) {
			st.add(arr2[i]);
		}
		st.sort((Comparator<? super String>) new Comparator<String>() {
			@override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		System.out.println(st);
		
		ArrayList<String> list =new ArrayList<>();
		
		int cnt =arr1.length +arr2.length;
		int i=0 , j=0;
		
		while(cnt > list.size()) {
			if(i <arr1.length) {
				list.add(arr1[i]);
				i++;
			}if(j <arr2.length) {
				list.add(arr2[j]);
				j++;
			}
		}
		System.out.println(list);
		
		System.out.println();
		System.out.println("--오름차순 정렬--");
		list.sort((Comparator<? super String>) new Comparator<String>() {
			@override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
		

	}

}
