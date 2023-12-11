package chapter06;



public class ArrayTest9{
	public static void main(String[] args) {
		//Member 클래스 타입의 배열 5개 생성 합니다.
		Member[] members = new Member[5];
		
		//배열의 요소에 참조 값 대입합니다.
		members[0] = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "cha", "차두리");
		
		//배열의 요소인 참조 변수를 통해 객체의 멤버에 참조합니다.
		for (int i = 0; i < members.length; i++) {
			System.out.printf("%d번 회원의 아이디는 %s이고, 이름은 %s입니다.\n", members[i].memberNo, members[i].memberId, members[i].memberName);
		}
		
	}
}