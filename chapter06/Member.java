package chapter06;

public class Member {
	int memberNo;
	String memberId;
	String memberName;
	
	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberNo + ". " + memberId + " (" + memberName + ")";
	}
}