/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @author Hector, Jonathan y Damian
 */
import java.util.ArrayList;
import java.util.List;
public class POO5 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Uriel");
        alumno.setApellido("Jimenez");
        alumno.setCarrera("Narcología");
        alumno.setEscuela("VirusAntrax");
        Fecha fecha = new Fecha(7, 11, 2004);
        Alumno alumno2 = new Alumno("Kevin", "El0711", "Narcología", "VirusAntrax", 4, fecha);
        String var = alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alumno2);

        Coche coche1 = new Coche("Toyota", "Camry", "Rojo", "V6", "Gasolina");
        coche1.avanzar();
        coche1.retroceder();
        System.out.println(coche1);

        Profesor profesor = new Profesor("Juan", "Pérez", 35, "Matemáticas");
        profesor.agregarCurso("Álgebra");
        profesor.agregarCurso("Cálculo");

        String nombreProfesor = profesor.obtenerNombre();
        String especialidadProfesor = profesor.obtenerEspecialidad();
        int edadProfesor = profesor.obtenerEdad();
        List<String> cursosProfesor = profesor.obtenerCursos();

        System.out.println("Nombre del profesor: " + nombreProfesor);
        System.out.println("Especialidad del profesor: " + especialidadProfesor);
        System.out.println("Edad del profesor: " + edadProfesor);
        System.out.println("Cursos del profesor: " + cursosProfesor);
    }
}
