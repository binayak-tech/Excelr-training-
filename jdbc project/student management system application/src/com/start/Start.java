package com.start;

import com.entity.Student;
import com.studentDao.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to com.entity.Student Management System Application");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("Press 1 to ADD new Student");
            System.out.println("Press 2 to DELETE a Student");
            System.out.println("Press 3 to DISPLAY a Student Details");
            System.out.println("Press 4 to EXIT");
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    // ADD a new student
                    System.out.println("Enter Student Id: ");
                    int id = Integer.parseInt(br.readLine());

                    System.out.println("Enter Student Name: ");
                    String name = br.readLine();

                    System.out.println("Enter Student Phone No.: ");
                    String phone = br.readLine();

                    System.out.println("Enter Student City: ");
                    String city = br.readLine();

                    // create student object;
                    Student stu = new Student(id, name, phone, city);

                    boolean ans = StudentDao.insertStudent(stu);
                    if (ans) {
                        System.out.println("Student is added successfully");
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;

                case 2: // delete
                    break;
                case 3: // display
                    break;
                case 4: // exit
                    go = false;
                    break;
                default:
                    System.out.println("wrong choice try again");
            }

        }
        System.out.println("Thanks");
    }
}
