/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.clase;

/**
 *
 * @author Admin
 */
public class Alumno {
    private String nombre, apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String aux="NOMBRE: "+nombre+" APELLIDO: "+apellido+" EDAD: "+edad;
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
