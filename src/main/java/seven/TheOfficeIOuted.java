package seven;

/**
 * <a href="https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java">...</a>
 */
public class TheOfficeIOuted {
    public static String outed(Person[] meet, String boss) {
        double happinesRate = 0;

        for (var person : meet) {
            if (person.name.equals(boss)) {
                happinesRate += person.happiness * 2;
            } else {
                happinesRate += person.happiness;
            }
        }

        return happinesRate / meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}

class Person {
    final String name;    // team memnber's name
    final int happiness;  // happiness rating out of 10

    Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }
}
