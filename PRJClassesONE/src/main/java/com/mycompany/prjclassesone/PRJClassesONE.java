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

    private static STUDENTS s = new STUDENTS();
    
    public static void main(String[] args) 
    {
       String strName = JOptionPane.showInputDialog(null, "Please enter the student name");
       String strCource = JOptionPane.showInputDialog(null, "Please enter student cource");
       double dblAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter student average resualts"));
       
       s.setName(strName);
       s.setCourse(strCource);
       s.setAverage(dblAvg);
       print();
        
    }
    public static void print()
    {
        String strDiplay = "The updated student average resualts are: \n"  + "STUDENT:  " + s.getName() 
                                                                  + "\n" + "COURCE: " + s.getCourse() + "\n" + "AVERAGE:" + s.getAverage() + "%";
    
    }
}
