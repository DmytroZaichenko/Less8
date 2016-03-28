package CharExaple;

import java.io.FileWriter;
import java.io.IOException;

public class JDKWriter implements WorkWithFile.FileWriter{
    @Override
    public void write(String data, String fileName) {
        try(
                java.io.FileWriter fileWriter = new java.io.FileWriter(fileName);
        ){
            fileWriter.write(data);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
