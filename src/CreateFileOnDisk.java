import java.io.*;

public class CreateFileOnDisk {

    public static void main(String[] args) {

        newFile();
        String homeDir = System.getProperty("user.dir");
        TreeOfHomeDir(homeDir);

    }

    public static void TreeOfHomeDir(String folder){

        File f = new File(folder);
        if (f.isDirectory() && !(f.getName().isEmpty())){
            System.out.println(f.getName());
            TreeOfHomeDir(f.getParentFile().getAbsolutePath());
        }
    }

    public static void newFile(){

        String nameFile = "test.txt";
        String pathFile = "/testJava/";
        String diskFile = "c";

        for (File disk : File.listRoots()){

            if (disk.getAbsolutePath().toCharArray()[0] == diskFile.toUpperCase().toCharArray()[0]){

                String pathFolder = disk.getAbsolutePath() + pathFile.replace("/",File.separator);
                File folder = new File(pathFolder);
                if (!folder.exists()){
                    if (folder.mkdir()) {
                        crFile(folder,nameFile);
                    }
                }else {
                    crFile(folder, nameFile);
                }
                break;
            }
        }
    }

    private static void crFile(File folder, String nameFile) {
        nameFile = folder.getAbsolutePath() + File.separator + nameFile;
        File f = new File(nameFile);
        if (! f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void crFile1(File folder, String nameFile){
        nameFile = folder.getAbsolutePath() + File.separator + nameFile;

    }

}


