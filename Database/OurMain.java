package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

/**
 * Created by Danielle98 on 10/13/2016.
 */
public class OurMain {

    public static void main(String[] args){

        List<Student> students = new ArrayList<Student>();

        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("Data.txt"));
            int i = 6;
            String newSN = "";
            String newFN = "";
            String newMI = "";
            String newLN = "";
            String newCourse = "";
            String newYL = "";
            while ((sCurrentLine = br.readLine()) != null) {
                if (i % 6 == 0){
                    newSN = sCurrentLine;
                }else if (i % 6 == 1){
                    newFN = sCurrentLine;
                }else if (i % 6 == 2){
                    newMI = sCurrentLine;
                }else if(i % 6 == 3){
                    newLN = sCurrentLine;
                }else if(i % 6 == 4){
                    newCourse = sCurrentLine;
                }else if(i % 6 == 5){
                    newYL = sCurrentLine;
                Student a = new Student(newSN,newFN, newMI.charAt(0), newLN, newCourse,Integer.parseInt(newYL));
                students.add(a);
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }



        System.out.println("\t\t\tMENU");
        System.out.println("1. Add a student\n2. Remove a student\n3. View data\n4. Save data\n5. Exit");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        s.nextLine();

        int flag = 1;

     do {
             if (choice == 1) {
             System.out.print("Enter Student Number: ");
             String sn = s.nextLine();

                 for (Student toCheck : students) {
                     if ((toCheck.getStudentNumber()).equals(sn)) {
                         System.out.println("A Student with the same student number already exist");
                         flag = 0;
                     }
                 }
             if(flag == 0){ break; }
             System.out.print("Enter First Name: ");
             String fn = s.nextLine();
             System.out.print("Enter Middle Initial: ");
             String mi = s.nextLine();
             System.out.print("Enter Last Name: ");
             String ln = s.nextLine();
             System.out.print("Enter Course: ");
             String course = s.nextLine();
             System.out.print("Enter year level: ");
             int yl = s.nextInt();



             Student bago = new Student(sn, fn, mi.charAt(0), ln, course, yl);
             students.add(bago);
             System.out.println("Done");
         } else if (choice == 2) {
             System.out.println("Enter Student Number of the Student you want to remove: ");
             String snRemoved = s.next();
             for (Student toBeRemoved : students) {
                 if (toBeRemoved.getStudentNumber().equals(snRemoved)) {
                     students.remove(toBeRemoved);
                     break;
                 }
             }
             System.out.println("Done");
         } else if (choice == 3) {
             int flager = 1;
             System.out.println("Enter Student Number of the Student you want to view: ");
             String snToView = s.next();
               for (Student toView : students) {
                 if ((toView.getStudentNumber()).equals(snToView)) {
                     System.out.println(String.format("Student Number: %s\nFirst Name: %s\nMiddle Initial: %c\nLast Name: %s\nCourse: %s\nYear Level: %d\n",toView.getStudentNumber(),toView.getFirstName(),toView.getMiddleInitial(),toView.getLastName(),toView.getCourse(),toView.getYearLevel()));
                     flager = 0;
                 }
             }
             if(flager == 1){
                 System.out.println("Student is not enrolled or has been removed");
             }
             System.out.println("Done");
         } else if (choice == 4) {
             try {

                 File file = new File("Data.txt");
                 // if file doesnt exists, then create it
                 if (!file.exists()) {
                     file.createNewFile();
                 }

                 FileWriter fw = new FileWriter(file);
                 BufferedWriter bw = new BufferedWriter(fw);
                 for (Student toSave : students) {
                     bw.write(toSave.getStudentNumber());
                     bw.newLine();
                     bw.write(toSave.getFirstName());
                     bw.newLine();
                     bw.write(toSave.getMiddleInitial());
                     bw.newLine();
                     bw.write(toSave.getLastName());
                     bw.newLine();
                     bw.write(toSave.getCourse());
                     bw.newLine();
                     bw.write(toSave.getYearLevel());
                 }

                 bw.close();

                 System.out.println("Done");

             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

         System.out.println("Would you like to choose again?\n1. Add a student\n2. Remove a student\n3. View data\n4. Save data\n5. Exit");
         choice = s.nextInt();
     }while(choice != 5);

    }

}