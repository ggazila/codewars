package six;

public class SimpleCardGame {

    public String winner(String[] deckSteve, String[] deckJosh) {
        int countSteve = 0;
        int countJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            int steve = getValue(deckSteve[i]);
            int josh = getValue(deckJosh[i]);

            if (steve - josh > 0) {
                countSteve++;
            } else if (steve - josh < 0) {
                countJosh++;
            }
        }

        if (countSteve > countJosh) {
            return "Steve wins %d to %s".formatted(countSteve, countJosh);
        } else if (countSteve < countJosh) {
            return "Josh wins %d to %s".formatted(countJosh, countSteve);
        }

        return "Tie";
    }

    private int getValue(String deck) {
        return switch (deck) {
            case "T" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> Integer.parseInt(deck);
        };
    }
}