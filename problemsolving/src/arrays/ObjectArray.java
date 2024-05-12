package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO convert Object array to Integer array
		Object[] input = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 } };
		Stream<Object> flattenedArray = flatten(input);
		Integer[] result = flattenedArray.toArray(Integer[]::new);
		System.out.println(Arrays.toString(result));

	}
	
	private static Stream<Object> flatten(Object[] input) {
		// Convert the input array into a stream of objects
		Stream<Object> stream = Stream.of(input);
		//Recursively flatten the array by mapping each element to a stream of objects, and then concatenating all the streams into a single stream
		stream = stream.flatMap(o -> o instanceof Object[] ? flatten((Object[]) o) : Stream.of(o));
		return stream;
	}

}
