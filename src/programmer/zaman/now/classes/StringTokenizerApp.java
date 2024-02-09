package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {
         String name = "Bernhard Winner Manurung";
         StringTokenizer tokenizer = new StringTokenizer(name, " ");

         while(tokenizer.hasMoreTokens()) {
             String result = tokenizer.nextToken();
             System.out.println(result);
         };
    }
}
