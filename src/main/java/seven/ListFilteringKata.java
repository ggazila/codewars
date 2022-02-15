package seven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
List Filtering
https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
 */
public class ListFilteringKata {

    public static List filterList(final List list) {
        List<Integer> ints = new ArrayList<>();

        for (Object o : list) {
            if (o instanceof Integer) {
                ints.add((int) o);
            }
        }

        return ints;
    }

    public static List filterListStream(final List list) {
        return (List<Object>) list.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
    }

}
