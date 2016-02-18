import java.io.ByteArrayInputStream;

/**
 * Created by admin on 18.02.2016.
 */
public class IntTo {
    public static void main(String[] args) {
//        for (int i = 0; i < 300; i++){
//            System.out.println(" " + i +" "+(byte)i);
//        }

        byte[] bytes = {63,64,65,66,67,-27,-128,0};
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        byte[] b = new byte[10];
        in.read(b,2,4);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

//        int i;
//        while((i = in.read()) != -1){
//            System.out.print(i);
//            System.out.println(" ");
//        }

    }
}
