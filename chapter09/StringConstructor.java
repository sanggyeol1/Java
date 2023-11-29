package chapter09;

public class StringConstructor {

	public static void main(String[] args) {
			//byte 배열 전체를 Strong객체로 생성
		//String str01 = new String(byte[] byte);
			byte[] bytes = {74, 97, 118, 97};
		String str01 = new String(bytes);
		System.out.println(str01);

		
		//byte 배열의 offset인덱스 위치부터 length만큼 String객체로 생성
		//String str02 = new String(byte[] bytes, int offset, int length);
		String str02 = new String(bytes, 2, 2);
		System.out.println(str02);
		
		
		//배열 전체를 String 객체로 생성
		//String str03 = new String(char[] value);
			char[] chars = {'J', 'A', 'V', 'A', ' ', 'H', 'E', 'L', 'L', 'O'};
			String str03 = new String(chars);
			System.out.println(str03);
			
		//배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
		//String str2 = new String(char[] value, int offset, int length);
		String str04 = new String(chars, 4,6);
		System.out.println(str04);
		
		//String 복사
		//String str4 = new String(String original);
		String str05 = "abc";
		String str06 = new String(str05);
		System.out.println(str06);
	
	
	}

}
