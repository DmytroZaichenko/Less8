import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Created by admin on 28.02.2016.
 */
public class BAISWriter {

    public static void main(String[] args) {
        byte[] bytes = {63, 64, 65, 66, 67, -27, -128, 0};

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]);
        }
        System.out.println(Arrays.toString(out.toByteArray()));


        printStreamData(new ByteArrayInputStream(bytes));

    }

    private static void printStreamData(ByteArrayInputStream in){

        int i;
        while((i = in.read()) != -1){
            System.out.println(i);
        }
    }

}
