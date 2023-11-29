package chapter11;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList<E> 타입의 참조변수 선언
		ArrayList<String> players = null; //String 타입의 인스턴트를 저장하는 list 참조변수
		//ArrayList<E> 타입의 인스턴스 생성
		players = new ArrayList<String>();
		
		//요소 인스턴스 저장
		players.add("손흥민");
		players.add(new String("박지성"));
		players.add(new String("차범근"));
		
		//ArrayList의 요소 참조
		System.out.println("index-0 위치의 데이터 : " + players.get(0));
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		
		//특정 index 위치에 요소 저장
		players.add(1,new String("안정환"));
		System.out.println("index-1 위치에 새로운 데이터 입력");
		
		//index가 1인 위치에는 박지성이 있으나 안정환으로 변경
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		//index가 쉬프트 되어 하나씩 밀림
		System.out.println("index-2 위치의 데이터 : " + players.get(2));
		System.out.println("index-3 위치의 데이터 : " + players.get(3));
		
		//List<E>인스턴스가 저장하는 요소의 개수 반환
		System.out.println("모든 플레이어는 " + players.size() + "명 입니다.");
		
		//마지막 index는 : 요소의 개수 - 1;
		int lastIndex = players.size() - 1;
		String lastPlayer = players.get(lastIndex);
		System.out.println("last-index위치의 데이터 : " + lastPlayer );

		//반복문을 이용한 일괄처리
		for(int i = 0; i< players.size(); i++) {
			System.out.println(players.get(i));
		}
	}

}
