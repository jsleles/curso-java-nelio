package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Joao");
		list.add("Pedro");
		list.add("Rita");
		list.add("Jonilson");
		list.add("Simone");
		list.add("Matheus"); 
		list.add("Anna");
		
	 Stream<String> st = list.stream().sorted();
	 
	 st.forEach(System.out::println);
	 
	 Map<Integer,String> listMap = new HashMap<>();
	 	listMap.put(1,"Joao");
	 	listMap.put(2,"Pedro");
	 	listMap.put(3,"Rita");
	 	listMap.put(4,"Jonilson");
	 	listMap.put(5,"Simone");
	 	listMap.put(6,"Matheus"); 
	 	listMap.put(7,"Anna");
	 
	 Stream<String> st2 = listMap.values().stream().sorted();
	 st2.forEach(System.out::println);
	 	
		
		
		
		
	}
	
}
