package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOp {
    public static void main(String[] args) {

        File file = new File("FIleOperation.txt");

        // CREATE
        /*try {
            file.createNewFile();
            System.out.println("File is successfully created");
        }catch (IOException e) {
            e.printStackTrace();
        }*/

        //  WRITE
        try {
            FileWriter fw = new FileWriter("FileOperation.txt");
            fw.write("Hie this is my first file...");
            System.out.println("data written in the file successfully");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        // READ
        /*try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/


        // DELETE

        /*if(file.delete()){
            System.out.println(file.getName() + " File is deleted");
        }else{
            System.out.println("Some error occurred while deleting the file");
        }*/

    }
}
