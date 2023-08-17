package com.studentDao;

import com.connectionjdbc.ConnectionJdbc;
import com.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {

    public static boolean insertStudent (Student stu){
        boolean f = false;
        try {
            // jdbc code
            Connection conn = ConnectionJdbc.createConn();
            String q = "Insert into  students(std_id, std_name, std_phone_num, std_city) values(?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(q);

            p.setInt(1, stu.getStudentId());
            p.setString(2, stu.getStudentName());
            p.setString(3, stu.getStudentPhone());
            p.setString(4, stu.getStudentCity());

            // execute
            p.executeUpdate();
            f=true;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
