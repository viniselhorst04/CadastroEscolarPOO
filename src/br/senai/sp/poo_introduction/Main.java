package br.senai.sp.poo_introduction;

import br.senai.sp.poo_introduction.Model.Register;
import br.senai.sp.poo_introduction.Model.Student;
import br.senai.sp.poo_introduction.Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("\nHello");
        System.out.println("You is a Teacher or a Student?");
        System.out.println("1- Teacher or 2- Student 3- Both");
        escolha = teclado.nextInt();

        if (escolha == 1){

            /** Instanciar RegisterProf*/
            Register objRegisterProf = new Register();
            objRegisterProf.RegisterTeacher();

        } else if(escolha == 2){

            /** Instanciar RegisterProf*/
            Register objRegisterAluno = new Register();
            objRegisterAluno.RegisterSdudent();

        }else if(escolha == 3) {

            Register objRegisterBoth = new Register();
            objRegisterBoth.RegisterBoth();

        }




    }
}
