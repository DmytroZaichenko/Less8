package WorkWithFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {

        String fileName = "data.txt";
        FileWriter writer = new LegacyFileWriter();
        writer.write("I love programming!", fileName);

        FileReader reader = new LegacyFileReader();
        System.out.println(reader.read(fileName));

        writer = new DefaultFileWriter();
        writer.write("Me too: ", fileName);

        reader = new DefaultFileReader();
        System.out.println(reader.read(fileName));

        Demo d = new Demo();
        Demo.CopyFile cf = d.new CopyFile(fileName);

        fileName = "kons.mpu";
        reader = new BufferedReader();
        System.out.println(reader.read(fileName));


    }

    public class CopyFile{


        public CopyFile(String fileName) {
            String newFileName = fileName.substring(0,fileName.length() - 4) + "Copy.txt";
            StringBuilder sb = new StringBuilder();
            try{
                FileInputStream fis = new FileInputStream(fileName);
                int i;
                while ((i = fis.read()) != -1){
                    sb.append((char)i);
                }
                writeToNewFile(sb.toString(),newFileName);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        private void writeToNewFile(String sb, String fileName){
            try {
                FileOutputStream fos = new FileOutputStream(fileName);
                fos.write(sb.getBytes());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
