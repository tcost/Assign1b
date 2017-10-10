/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assign1b;

import com.mycompany.student_registration.Course;
import com.mycompany.student_registration.Module;
import com.mycompany.student_registration.Student;
import org.joda.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Thomas
 */
public class Driver {
    
    public static void main(String[]args){
        
        ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Module> modules = new ArrayList<Module>();
        ArrayList<Course> courses = new ArrayList<Course>();
        
         
         
        Student s1 = new Student(13368521, "Thomas","Costello", new LocalDate(01-01-96), 21 ); 
        Student s2 = new Student(13452341, "Anthony", "Collins", new LocalDate(12-04-95), 22);
        Student s3 = new Student (12254367,"Patrick" , "Burke", new LocalDate(03-04-95), 22);
        
       students.add(s1);
       students.add(s2);
       students.add(s3);
       
       Module m1 = new Module ("Machine Learning", 0021, students );
       Module m2 = new Module("Software Engineering ", 0022, students);
       Module m3 = new Module("Professional Skills ", 0023, students);
     
       modules.add(m1);
       modules.add(m2);
       modules.add(m3);
       
       Course c1 = new Course("Computer Science", new LocalDate(01-02-17), new LocalDate(05-05-21),modules );
       System.out.println(c1);
		
		
		
    }    
}
