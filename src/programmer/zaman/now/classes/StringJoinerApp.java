package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Bernhard");
        joiner.add("Winner");
        joiner.add("Manurung");

        String value = joiner.toString();
        System.out.println(joiner);

    }
}
