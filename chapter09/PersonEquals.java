package chapter09;

public class PersonEquals {

	public static void main(String[] args) {
		
		Person person1 = new Person("LEE", "20001010-10000000");
		Person person2 = new Person("Lee", "20001010-10000000");
		
		System.out.println("참조변수의 비교");
		System.out.println("person1==person2 =>"+ (person1==person2));
		System.out.println();
		System.out.println("인스턴스의 equals() 메소드로 비교");
		System.out.println("person1.equals(person2) => "+person1.equals(person2));
		
	}

}
	
	class Person{
		String name;
		String juminNo;
		
		public Person(String name, String juminNo) {
			this.juminNo = juminNo;
		}
		
		@Override
		public boolean equals(Object obj) {
			Person p = null;
			if(obj instanceof Person) {
				p = (Person)obj;
			}
			if(p!=null && this.juminNo.equals(p.juminNo)) {
				return true;
			}
			return false;
		}
	}


