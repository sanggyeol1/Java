package chapter11;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("apple");
		
		list.add("Banana");
		list.add("Mango");
		list.add("Pear");
		list.add("Grape");
		
		int index = list.indexOf("Mango");
		System.out.println(index);
		

	}

}
