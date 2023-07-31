import java.io.EOFException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sem2 {
    public static void main(String[] args) {
        task3(repeat(100, "TEAST"));
    }

    static String task0(int n, char c1, char c2) {

        /** дано четное число N(>0) и символи c1 , c2 . написать метод ,который вернет строку длини N , который состаит
         * из символов C1 c2 начиная c c1 ..
         */

        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(c1).append(c2);
            }
            return stringBuilder.toString();
        } else {
            System.out.println("N is nor even number");
            return null;
        }
    }

    static String task1(String str) {
        /* напищите метод который сжимает строку ; пример ; вьод aaaabbbcdd ; выход;a4b3cd2

         */

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                stringBuilder.append(chars[i - 1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length - 1]).append(count + 1);
        return stringBuilder.toString();
    }

    static boolean task2(String str) {
        /**
         *
         *
         */


        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        return str.equals(str2);
    }

    static void task3(String str) {
        String path = "text.text";
        try (FileWriter writer = new FileWriter(path, true);) {
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String repeat(int n, String str) {
        return str.repeat(n);
    }
}