package six;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        var map = Stream.of(lstOf1stLetter).collect(Collectors.toMap(letter -> letter, letter -> 0));

        for (String book : lstOfArt) {
            String firstLetter = book.substring(0, 1);
            int amount = Integer.parseInt(book.substring(book.lastIndexOf(" ") + 1));
            map.computeIfPresent(firstLetter, (s, sum) -> sum + amount);
        }

        int total = map.values().stream().mapToInt(i -> i).sum();

        if (total == 0) {
            return "";
        }


        String[] rows = new String[map.size()];
        int count = 0;
        for (var entry : map.entrySet()) {
            rows[count++] = "(%s : %d)".formatted(entry.getKey(), entry.getValue());
        }

        return String.join(" - ", rows);
    }
}
