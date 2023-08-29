package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {

    boolean flag = true;


    /** Instance Output*/
    Output output = new Output();

    Teacher teacher = new Teacher();
    Student objStudent = new  Student();

    public void RegisterSdudent(){


        Scanner teclado = new Scanner(System.in);

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

        if (flag){
            output.PrintStudent(objStudent);
        }


    }
    public void RegisterTeacher(){
        Scanner teclado = new Scanner(System.in);
//        Instacia objeto Teacher


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

        if (flag){
            output.PrintTeacher(teacher);
        }


    }

    public void RegisterBoth(){
        flag = false;
        RegisterTeacher();
        RegisterSdudent();
        output.PrintTeacher(teacher);
        output.PrintStudent(objStudent);

    }
}
