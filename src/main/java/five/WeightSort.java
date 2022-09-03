package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

    public static String orderWeight(String strng) {
        if (strng.isEmpty()) {
            return strng;
        }

        Map<Long, List<String>> map = new TreeMap<>();

        String[] weights = strng.strip().split(" ");

        for (String weight : weights) {
            long num = getSum(weight);
            List<String> row = map.getOrDefault(num, new ArrayList<>());
            row.add(weight);
            map.put(num, row);
        }

        List<String> combine = new ArrayList<>();

        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                Collections.sort(list);
            }
            combine.addAll(list);
        }

        return String.join(" ", combine);
    }

    private static long getSum(String weight) {
        long num = Long.parseLong(weight.strip());
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
