import sun.misc.InvalidJarIndexException;

import java.io.*;
import java.util.Arrays;

/**
 * Created by admin on 28.02.2016.
 */
public class BAISWriter {

    public static void main(String[] args) {
//        byte[] bytes = {63, 64, 65, 66, 67, -27, -128, 0};
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        for (int i = 0; i < bytes.length; i++) {
//            out.write(bytes[i]);
//        }
//        System.out.println(Arrays.toString(out.toByteArray()));
//        printStreamData(new ByteArrayInputStream(bytes));

        String myT = "it's my text for copy in file";
        InputStream is = new ByteArrayInputStream(myT.getBytes());
        try {
            printStreamData(is);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    private static void printStreamData(ByteArrayInputStream in){

        int i;
        while((i = in.read()) != -1){
            System.out.println(i);
        }
    }

    private static void printStreamData(InputStream is) throws IOException{

        File newFile = new File("newData.txt");
        OutputStream output  = null;
        try{
            output = new FileOutputStream(newFile);
            int i;
            while ((i = is.read()) != -1){
                output.write(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            is.close();
            output.close();
        }

    }




}
