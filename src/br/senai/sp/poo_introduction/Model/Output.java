package br.senai.sp.poo_introduction.Model;

public class Output {

    public void PrintTeacher(Teacher teacher){

        /** Print informations */
        System.out.println("\nTeacher information:");
        System.out.println("Teacher´s Name is: " + teacher.name);
        System.out.println("Teacher´s Age is: " + teacher.age);
        System.out.println("Teacher´s E-mail is: " + teacher.email);
        System.out.println("Teacher´s Phone Number is: " + teacher.phoneNumber);
        System.out.println("Teacher´s Specialist is: " + teacher.specialist);
        System.out.println("===========================================================\n");

    }

    public void PrintStudent(Student objStudent){


        System.out.println("\nStudent information:");
        System.out.println("Student´s Name is: " + objStudent.name);
        System.out.println("Student´s Age is: " + objStudent.age);
        System.out.println("Student´s Grade 1 is: " + objStudent.grade1);
        System.out.println("Student´s Grade 2 is: " + objStudent.grade2);
        System.out.println("Student´s Frequency is: " + objStudent.frequency);
        System.out.println("===========================================================\n");
    }


}
