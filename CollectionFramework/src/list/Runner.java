package list;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		

		//linkedListExample();
		//dequeListExample();
		//hashSetListExample();
		//treeSetListExample();
		//hashMapExample();
		//treeMapExample();
		//queueExample();
		stackExample();
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
	 * There is no specific order in which objects are placed in a HashSet
	 */
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
		Iterator<Integer> iterator = numbers.iterator();
		
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
	
	/*
	 * There is a specific order in which objects are placed in a TreeSet
	 */
	private static void treeSetListExample() {
		TreeSet<String> words = new TreeSet<String>();
		
		words.add("sd");
		words.add("Hello");
		words.add("JDNF");
		words.add("Allen");
		words.add("Java");
		
		words.remove("Allen");
		
		System.out.println(words);
	}
	
	private static void hashMapExample() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "Japan");
		map.put(1, "USA");
		map.put(2, "Scottland");
		
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
				
		map2.put(0, "Japan");
		map2.put(1, "USA");
		map2.put(2, "Scottland");
		
		System.out.println("Maps are equal: " + map.equals(map2));
		
	}
	
	private static void treeMapExample() {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(0, "Japan");
		map.put(1, "USA");
		map.put(2, "Scottland");
		
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
				
		map2.put(0, "Japan");
		map2.put(1, "USA");
		map2.put(2, "Scottland");
		
	}
	
	/*
	 * Summary on Maps and Sets
	 * HashMap and HashSet are good for adding, removing, and contains operations. Not in order
	 * 
	 * TreeMap and TreeSet are good for storing and accessing data. In order
	 */
	
	
	
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
	
	//FIFO
	private static void queueExample() {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.offer(2);
		queue.add(0);
		queue.offer(9);
		
		//queue.clear();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		queue2.add(1);
		queue2.add(2);
		queue2.add(0);
		
		System.out.println("Are queue and queue2 equal? " + queue.containsAll(queue2));
		
		
		System.out.println(queue);
		
		queue.remove();
		
		System.out.println(queue);
		
		// 2 ways to iterate through the list
		queue.forEach((i) -> {
			System.out.println(i);
		});
		
		System.out.println("\n");
		
		Iterator<Integer> i = queue.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n");
		
		queue.clear();
		queue2.clear();
		
	}
	
	// LIFO
	private static void stackExample() {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Hello");
		stack.push("Allen");
		stack.push("Java");
		stack.push("Program");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println("Is this stack empty? " + stack.empty());
		
		System.out.println("Stack position of word 'Allen': " + stack.search("Allen"));
	}
	
}

















