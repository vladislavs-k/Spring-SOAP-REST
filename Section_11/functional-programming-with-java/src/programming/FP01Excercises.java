package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP01Excercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//		printAllNumbersInListFunctional(Numbers);
//		printEvenNumbersInListFunctional(numbers);
		printOddNumbersInListFunctional(numbers);
		printAllCourses(courses);
		printSpringCourses(courses);
		printFourLettersCourses(courses);
		printCubesOfOddNumbersInListFunctional(numbers);
		printNumbersOfCoursesCharacters(courses);
	}
	

//	private static void printAllNumbersInListFunctional(List<Integer> numbers) {	
//		System.out.println("Functional:");
//		numbers.stream().forEach(System.out::println);
//	}
	

//	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
//		System.out.println("\nFunctional Even: ");
//		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("\nFunctional Odd: ");
		numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	}
	
	private static void printAllCourses(List<String> courses) {
		System.out.println("\nFunctional Courses: ");
		courses.stream().forEach(System.out::println);
	}
	
	private static void printSpringCourses(List<String> courses) {
		System.out.println("\nFunctional Spring Courses: ");
		courses.stream().filter(c -> c.contains("Spring")).forEach(System.out::println);
	}
	
	private static void printFourLettersCourses(List<String> courses) {
		System.out.println("\nFunctional 4 letters Courses: ");
		courses.stream().filter(c -> c.length() >= 4).forEach(System.out::println);
	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("\nFunctional Cubes of Odd: ");
		numbers.stream()
			.filter(n -> n % 2 != 0)
			.map(n -> n * n * n)
			.forEach(System.out::println);
	}
	
	private static void printNumbersOfCoursesCharacters(List<String> courses) {
		System.out.println("\nFunctional Courses: ");
		courses.stream()
//			.map(c -> c.length())
//			.map(c -> c + " " + c.length())
			.map(c -> String.format("%15s (number of characters): %d", c, c.length()))
			.forEach(System.out::println);
	}

}
