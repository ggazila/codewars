package seven;

public class SquareDigit {

    public int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int temp = n % 10;
            sb.insert(0, temp * temp);
            n /= 10;
        }

        return Integer.parseInt(sb.toString());
    }

}