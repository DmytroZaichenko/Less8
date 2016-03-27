import java.io.*;

public class BufferedReader implements FileReader {
    @Override
    public String read(String fileName) {

        String strFileContents = "";
        try(
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis, 256);
        ){
            byte[] b = new byte[256];
            int bytesRead = 0;


            while ((bytesRead = bis.read(b)) != -1){
                strFileContents += new String(b, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return strFileContents;
    }
}
