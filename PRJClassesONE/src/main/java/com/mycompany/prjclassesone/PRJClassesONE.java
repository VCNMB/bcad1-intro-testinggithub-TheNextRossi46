/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclassesone;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PRJClassesONE {

    private static STUDENTS student = new STUDENTS();
    
    public static void main(String[] args) 
    {
       String strName = JOptionPane.showInputDialog(null, "Please enter the student name");
       String strCource = JOptionPane.showInputDialog(null, "Please enter student course");
       double dblAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter student average resualts"));
       
       student.setName(strName);
       student.setCourse(strCource);
       student.setAverage(dblAvg);
       print();
        
    }
    public static void print()
    {
        String strDisplay = "The updated student average resualts are: \n"  + "STUDENT:  " + student.getName() 
                                                                  + "\n" + "COURCE: " + student.getCourse() + "\n" + "AVERAGE:" + student.getAverage() + "%";
        
        JOptionPane.showMessageDialog(null,strDisplay);
    
    }
}
