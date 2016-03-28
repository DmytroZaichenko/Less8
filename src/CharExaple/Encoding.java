package CharExaple;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created by admin on 28.03.2016.
 */
public class Encoding {
    public static void main(String[] args) throws Exception {
        char ch = 'ж';
        String str = new String(new char[] {'ж'});

        System.out.println(ch);

        System.out.println();
        System.out.println("CodePoint: " + (int) ch);

        System.out.println();
        System.out.println("cp1251   " + Arrays.toString(str.getBytes("cp1251")));

        System.out.println();
        System.out.println("UTF-8    " + Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));

        System.out.println();
        System.out.println("UTF-16BE    " + Arrays.toString(str.getBytes(StandardCharsets.UTF_16BE)));
        System.out.println("UTF-16LE    " + Arrays.toString(str.getBytes(StandardCharsets.UTF_16LE)));

        System.out.println();
        System.out.println("UTF-32    " + Arrays.toString(str.getBytes("UTF-32")));




    }
}
