package CharExaple;

import java.util.Arrays;

public class Characters {
    public static void main(String[] args) {
        char copyright = 169;
        System.out.println(copyright);
        System.out.println();

        copyright = '\u00A9';
        System.out.println(copyright);
        System.out.println();

        printCodePontInfo(100);
        printCodePontInfo(500);
        printCodePontInfo(1000);
        printCodePontInfo(10000);
        printCodePontInfo(50000);
        printCodePontInfo(65600);
        printCodePontInfo(90000);
    }

    private static void printCodePontInfo(int codePoint){
        char[] chars = Character.toChars(codePoint);
        String str = new String(chars);

        System.out.println("Code Poing: " + codePoint);
        System.out.println("Char Array: " + Arrays.toString(chars));
        System.out.println("Res String: " + str);
        System.out.println("String len: " + str.length() );
        System.out.println("Code count: " + str.codePointCount(0, str.length()));
        System.out.println();


    }
}
