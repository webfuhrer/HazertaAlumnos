/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.clase;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Alumno> lista_alumnos=new ArrayList<Alumno>();
        int opcion=EntradaSalida.pedirOpcion();
        while(opcion!=4)
        {
            switch(opcion)
            {
                case 1:
                    //Insertar alumno
                    Alumno a=EntradaSalida.pedirDatosAlumno();
                    lista_alumnos.add(a);
                    break;
                case 2: 
                    //Listar alumnos
                    EntradaSalida.mostrarAlumnos(lista_alumnos);
                    break;
                case 3:
                    //Buscar alumno por nombre
                    String nombre=EntradaSalida.preguntarNombre();
                    Alumno b=buscarAlumnoPorNombre(nombre, lista_alumnos);
                    EntradaSalida.mostrarAlumno(b);
                    break;
                
            }
            opcion=EntradaSalida.pedirOpcion();
        }
        
    }

    private static Alumno buscarAlumnoPorNombre(String nombre_buscado, ArrayList<Alumno> lista_alumnos) {
        for (int x=0; x<lista_alumnos.size(); x++)
        {
            Alumno a=lista_alumnos.get(x);
            String nombre_alumno=a.getNombre();
            if(nombre_alumno.equalsIgnoreCase(nombre_buscado))
            {
                return a;
            }
        }
        return null;
    }
}
