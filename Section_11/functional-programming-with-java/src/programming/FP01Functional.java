package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> Numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListFunctional(Numbers);
		printEvenNumbersInListFunctional(Numbers);
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("Functional:");
//		numbers.stream().forEach(FP01Functional::print);	// :: - Method Reference
		numbers.stream().forEach(System.out::println);
	}
	
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("Functional Even: ");
		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
	}
	

}
