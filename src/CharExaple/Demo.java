package CharExaple;

public class Demo {

    public static void main(String[] args) {
        String fileName = "data1.txt";
        WorkWithFile.FileWriter writer = null;
        WorkWithFile.FileReader reader = null;

        writer = new JDKWriter();
        writer.write("Hi for JDK Writer", fileName);

        reader = new JDKReader();
        System.out.println(reader.read(fileName));

    }

}
