package five;

import java.math.BigInteger;

public class StringIncrementer {
	public static String incrementString(String str) {
		char[] chars = str.toCharArray();

		if (str.isEmpty() || !Character.isDigit(chars[chars.length - 1])) {
			return str + "1";
		} else if (Character.isDigit(chars[chars.length - 1]) && chars[chars.length - 1] != '9') {
			chars[chars.length - 1] = (char) (chars[chars.length - 1] + (char) 1);

			return new String(chars);
		}

		int startNumberIndex = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			if (!Character.isDigit(chars[i])) {
				startNumberIndex = i + 1;
				break;
			}
		}

		String rawNumber = str.substring(startNumberIndex);

		BigInteger incrementedNumber = new BigInteger(rawNumber).add(BigInteger.valueOf(1));

		int zeros = Math.max(0, str.length() - startNumberIndex - String.valueOf(incrementedNumber).length());

		return str.substring(0, startNumberIndex) + "0".repeat(zeros) + incrementedNumber;
	}
}
