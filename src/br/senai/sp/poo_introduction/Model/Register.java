package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {
    public void RegisterSdudent(){
        Scanner teclado = new Scanner(System.in);
        Student objStudent = new  Student();
        System.out.println("------------------------------------");
        System.out.print("Hello Student , whats your Name: ");
        objStudent.name = teclado.next();
        System.out.print("How old are you: ");
        objStudent.age = teclado.nextInt();
        System.out.print("Whats your email: ");
        objStudent.email = teclado.next();
        System.out.print("Whats your Frequency: ");
        objStudent.frequency = teclado.nextFloat();
        System.out.print("Say me your grade 1: ");
        objStudent.grade1= teclado.nextFloat();
        System.out.print("Say me your grade 2: ");
        objStudent.grade2 = teclado.nextFloat();
        System.out.println("-------------------------------------");

        System.out.println("\nStudent information:");
        System.out.println("Student´s Name is: " + objStudent.name);
        System.out.println("Student´s Age is: " + objStudent.age);
        System.out.println("Student´s Grade 1 is: " + objStudent.grade1);
        System.out.println("Student´s Grade 2 is: " + objStudent.grade2);
        System.out.println("Student´s Frequency is: " + objStudent.frequency);
        System.out.println("===========================================================");

    }
    public void RegisterTeacher(){
        Scanner teclado = new Scanner(System.in);
//        Instacia objeto Teacher

        Teacher teacher = new Teacher();
        System.out.println("------------------------------------");
        System.out.print("Hello teacher , whats your Name: ");
        teacher.name = teclado.nextLine();
        System.out.print("How old are you: ");
        teacher.age = teclado.nextInt();
        System.out.print("Whats your email: ");
        teacher.email = teclado.next();
        System.out.print("Whats your Specialist: ");
        teacher.specialist = teclado.next();
        System.out.print("Say me your Phone number: ");
        teacher.phoneNumber = teclado.nextLong();
        System.out.println("-------------------------------------");

        /** Print informations */
        System.out.println("\nTeacher information:");
        System.out.println("Teacher´s Name is: " + teacher.name);
        System.out.println("Teacher´s Age is: " + teacher.age);
        System.out.println("Teacher´s E-mail is: " + teacher.email);
        System.out.println("Teacher´s Phone Number is: " + teacher.phoneNumber);
        System.out.println("Teacher´s Specialist is: " + teacher.specialist);
        System.out.println("===========================================================");






    }

    public void RegisterBoth(){

       RegisterTeacher();
       RegisterSdudent();
    }
}
