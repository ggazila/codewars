package six;

import java.util.stream.Stream;

public class MessageValidator {

    public static boolean isAValidMessage(String message) {

        if (message.isEmpty() || message.equals("0")) {
            return true;
        }
        if (!Character.isDigit(message.charAt(0))) {
            return false;
        }

        var wordsLength = Stream.of(message.split("[0-9]+"))
                .filter(s -> s.length() > 0)
                .mapToInt(String::length)
                .toArray();
        var numbers = Stream.of(message.split("[A-Za-z]+"))
                .filter(s -> s.length() > 0)
                .mapToInt(Integer::parseInt)
                .toArray();

        if (wordsLength.length != numbers.length) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != wordsLength[i]) {
                return false;
            }
        }

        return true;
    }
}
