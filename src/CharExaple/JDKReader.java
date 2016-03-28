package CharExaple;

import java.io.*;

/**
 * Created by admin on 28.03.2016.
 */
public class JDKReader implements WorkWithFile.FileReader {
    @Override
    public String read(String fileName) {

        StringBuilder builder = new StringBuilder();

        try (
                FileInputStream fis = new FileInputStream(fileName);
                InputStreamReader reader = new InputStreamReader(fis);
                java.io.BufferedReader bufferedReader = new BufferedReader(reader);
             )
        {
            String str;
            while ((str = bufferedReader.readLine()) != null){
                builder.append(str);
            }


        } catch (IOException e){
            e.printStackTrace();
        }

        return builder.toString();
    }



}
