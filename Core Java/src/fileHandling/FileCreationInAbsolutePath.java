package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationInAbsolutePath {
    public static void main(String[] args) {
        String file_name;
        System.out.print("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        file_name = sc.next();

        File file = new File("\\Core Java"+file_name+".txt");

        try {
            if(file.exists()){
                System.out.println("File already exist.");
            }else{
                file.createNewFile();
                System.out.println("File created successfully !!");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
