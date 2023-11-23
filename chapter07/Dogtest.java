package chapter07;

class Amimal{
	int age;
	void eat() {
		System.out.println("먹고 있음...");
	}
}

class Dog extends Amimal{
	void bark() {
		System.out.println("짖고 있음...");
	}
}


public class Dogtest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}


