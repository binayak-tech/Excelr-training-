package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUDWithUserInput {
    public static void main(String[] args) {
        String file_name;
        char ch;
        File directory= new File("\\Core Java\\src\\fileHandling");

        boolean isActive = false;

        System.out.println("---- WELCOME TO FILE HANDLING OPERATIONS ----");
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("1. CREATE");
            System.out.println("2. WRITE ");
            System.out.println("3. READ ");
            System.out.println("4. DELETE ");

            System.out.println("enter your choice");
            int choice= sc.nextInt();

            switch(choice)
            {
                case 1:
                    // CREATE
                    System.out.print("Enter file name: ");
                    file_name = sc.next();
                    File file = new File(directory+"\\"+file_name);
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
                case 2:
                    //  WRITE
                    try {
                        System.out.println("Enter the file name onto which you want to write: ");
                        String fileName = sc.next();
                        FileWriter fw = new FileWriter(directory+"\\"+fileName);
                        System.out.println("Enter data: ");
                        String data = sc.next();
                        fw.write(data);
                        System.out.println("data written in the file successfully");
                        fw.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    // READ
                    System.out.println("Enter the file name that you want to read: ");
                    String fileName = sc.next();

                    Scanner fN = new Scanner(fileName);
                    while(fN.hasNextLine()){
                        String line = fN.nextLine();
                        System.out.println(line);
                    }
                    fN.close();
                    break;

                case 4:
                    // DELETE
                    System.out.println("Enter the file name that you want to delete: ");
                    String fName = sc.next();
                    File fileD = new File(directory+"\\"+fName);

                    if(fileD.delete()){
                        System.out.println(fileD.getName() + " File is deleted");
                    }else{
                        System.out.println("Some error occurred while deleting the file");
                    }

                    break;
                default:

                    System.out.println("your choice is incorrect. ");
                    break;
            }

            System.out.println("do you want to continue(y/n)");
            ch= sc.next().charAt(0);
        }

        while(ch=='y'|| ch=='Y' );
    }
}
