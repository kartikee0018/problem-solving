package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {5,3,2,7,4,2,7,9,4};
		int arr[] = {2,2,3,4,4,5,7,7,9};
		System.out.println(Arrays.toString(removeDuplicateElements(arr)));
		removeDuplicatesByMap(arr);
		
	}
	
	/**
	 * @param arr sorted array as input.
	 * @return it will return the non duplicate element array
	 */
	static int[] removeDuplicateElements(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
	
	/**
	 * this method takes integer array as input and print the elements who occurs only once
	 * @param arr
	 */
	static void removeDuplicatesByMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int element = arr[i];
			if(map.containsKey(element))
				map.put(element, map.get(element) + 1);
			else
				map.put(element, 1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1)
				System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
