package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = {{"a", "b"}, {"k", "s"}, {"c", "a"}, {"d"}, {"e", "f"}};
		System.out.println(Arrays.toString(convert2dTo1dArray(input)));
		System.out.println(Arrays.toString(removeDuplicateCharacter(input)));
		System.out.println(Arrays.toString(sortedArray(input)));
		System.out.println(Arrays.toString(filterCharacter(input)));

	}
	
	private static String[] convert2dTo1dArray(String[][] input) {
		// Stream.of(input) and Arrays.stream(input) both return same result
		return Stream.of(input).flatMap(Stream::of).toArray(String[]::new);
	}
	
	private static String[] removeDuplicateCharacter(String[][] input) {
//		return Stream.of(input).flatMap(Stream::of).distinct().toArray(String[]::new);
//		return Stream.of(input).flatMap(Stream::of).collect(Collectors.toSet()).stream().toArray(String[]::new);
		return Stream.of(input).flatMap(Stream::of).collect(Collectors.toSet()).toArray(String[]::new);
	}
	
	private static String[] sortedArray(String[][] input) {
		return Stream.of(input).flatMap(Stream::of).sorted().toArray(String[]::new);
	}
	
	private static String[] filterCharacter(String[][] input) {
		return Stream.of(input).flatMap(Stream::of).filter(x -> !"a".equals(x)).toArray(String[]::new);
	}

}
