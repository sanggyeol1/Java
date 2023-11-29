package chapter11;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> players = null;
		players = new ArrayList<String>();
		
		players.add("손흥민");
		players.add("박지성");
		players.add("안정환");
		players.add("차범근");
		players.add(players.size(),"차두리");
		
		players.set(2, "이강인");
		
		displayList(players);
		
		players.remove(players.size() - 1);
		System.out.println("마지막 요소 삭제");
		
		displayList(players);
		
		players.remove(2);
		System.out.println("이강인 삭제");
		System.out.println("현재 index 2 요소 : " + players.get(2));
		
		players.remove("차범근");
		System.out.println("차범근 삭제");
		
		displayList(players);
		
		players.clear();
		System.out.println("모든 요소 삭제");
		System.out.println("모든 요소의 갯수는 : " + players.size());
		
		
	}
	
	
	//for 반복문을 이용한 일괄처리 메서드 : 제너릭 메서드
	static <E> void displayList(ArrayList<E> list) {
		for(E player : list) {
			System.out.println(player);
		}
	}

}
