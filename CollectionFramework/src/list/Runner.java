package list;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		

		//linkedListExample();
		//dequeListExample();
		hashSetListExample();
	}
	
	private static void linkedListExample() {
		
		// Preferred to use Generics for type safety and eliminates casting 
		List<String> names = new LinkedList<String>();
		
		names.add("Allen");
		names.add("John");
		names.add("Jorge");
		
		System.out.println(names);
		
	}
	
	/*
	 * Double Ended Queue "Deck". Same as Stack and Queue lists combined
	 */
	private static void dequeListExample() {
		Deque<Integer> orders = new LinkedList<Integer>();
		
		orders.push(10);
		orders.push(200);
		orders.push(150);
		
		orders.offerFirst(202);
		orders.offer(1);
		orders.offerLast(2);
		orders.add(3);
		
		System.out.println(orders);
		
		orders.pop();
		
		orders.stream().forEach(System.out::println);
		
		
		/*
		 * push, pop, peek are used for Stack-type lists
		 * 
		 * add, remove, element are used for Queue-type lists
		 */
	}
	
	private static void hashSetListExample() {
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(1);
		numbers.clear();
		//numbers.add(null);
		numbers.add(23);
		numbers.add(45);
		numbers.remove(23);
		numbers.add(202);
		numbers.add(90);
		numbers.add(1);
		numbers.add(600);
		
		// size of the set
		System.out.println("Size: " + numbers.size());
		
		// is the set empty
		System.out.println("isEmpty: " + numbers.isEmpty());
		
		// does the set contain the Integer 45
		System.out.println("Contains: " + numbers.contains(45));
		
		System.out.println("\n\n");
		// iterate over all numbers in the hashset
		Iterator iterator = numbers.iterator();
		
		while(iterator.hasNext()) 
		{
			int value = (int) iterator.next();
			
			if(value % 2 == 1) {
				System.out.println(value + " odd");
				continue;
			}
			System.out.println(value + " even");
		}
		
	}

}

















