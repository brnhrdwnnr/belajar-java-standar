package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Bernhard");
        builder.append(" ");
        builder.append("Winner");
        builder.append(" ");
        builder.append("Manurung");

        String name = builder.toString();
        System.out.println(name);
    }
}
