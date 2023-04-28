package seven;

import java.util.stream.IntStream;

//https://www.codewars.com/kata/5a512f6a80eba857280000fc/train/java
public class NthSmallestElement {
	public static int nthSmallest(final int[] arr, final int n) {
		return IntStream.of(arr)
				.sorted()
				.skip(n - 1)
				.limit(1)
				.findAny()
				.orElse(0);
	}

}
