/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.clase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {
//Acceso default. Sólo se puede acceder desde el paquete
   public static int pedirOpcion() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Introducir alumno");
        System.out.println("2-Listar alumnos");
        System.out.println("3-Buscar alumnos por nombre");
        System.out.println("4-Salir");
        int op=sc.nextInt();
        return op;
    }

    static Alumno pedirDatosAlumno() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del alumno:");
        String nombre=sc.nextLine();
        System.out.println("Apellido del alumno:");
        String apellido=sc.nextLine();
        System.out.println("Edad del alumno:");
        int edad=sc.nextInt();
        Alumno a=new Alumno(nombre, apellido, edad);
       return a;
        
    }

    static void mostrarAlumnos(ArrayList<Alumno> lista_alumnos) {
        /*for(int i=0; i<lista_alumnos.size(); i++)
        {
            Alumno a=lista_alumnos.get(i);
            System.out.println(a);
        }*/
        for (Alumno alumno : lista_alumnos) {
            System.out.println(alumno);
        }
    }

    static String preguntarNombre() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del alumno:");
        String nombre=sc.nextLine();
        return nombre;
    }

    static void mostrarAlumno(Alumno b) {
        
        if (b==null)
        {
            System.out.println("Ese alumno no existe");
        }
        else
        {
            System.out.println("Alumno encontrado: "+b);
        }
    }
    
}
