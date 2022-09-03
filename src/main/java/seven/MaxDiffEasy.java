package seven;

public class MaxDiffEasy {

    public static int maxDiff(int[] lst) {
        if (lst.length == 0) {
            return 0;
        }

        int max = lst[0];
        int min = lst[0];

        for (int i : lst) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }
}