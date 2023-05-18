package five;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<String, Long> first = Stream.of(str1.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Map<String, Long> second = Stream.of(str2.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for (var stringLongEntry : second.entrySet()) {
            Long aLong = first.getOrDefault(stringLongEntry.getKey(), 0L);
            if (aLong < stringLongEntry.getValue()) {
                return false;
            }
        }


//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        boolean count = false;
//        for (char value : chars2) {
//            for (int i = 0; i < chars1.length; i++) {
//                char c = chars1[i];
//                if (value != c) {
//                    count = false;
//                } else {
//                    count = true;
//                    chars1[i] = 'A';
//                    break;
//                }
//            }
//
//            if (!count) {
//                return false;
//            }
//        }
        return true;
    }
}
