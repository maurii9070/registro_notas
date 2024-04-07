package ar.edu.unju.fi.main;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

import java.util.Scanner;

public class Main{

    public static Alumno generarAlumno(){
        //Nos piden que para el alumno X se registre las notas finales de 2 Materias
        Alumno alumno = new Alumno();

        //Ingresar datos por consola
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el legajo del alumno: ");
        Integer legajo = sc.nextInt();

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.next();

        System.out.print("Ingrese el apellido del alumno: ");
        String apellido = sc.next();

        //Guardando datos en Alumno
        alumno.setLegajo(legajo);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);

        return alumno;
    }

    public static void registrarNotas(Alumno alumno, int numMaterias){
        Scanner sc = new Scanner(System.in);

        while (numMaterias <= 2) {
            //Cargar Materias
            System.out.print("Ingrese el codigo de la materia: ");
            String codigoMateria = sc.next();

            System.out.print("Ingrese el nombre de la materia: ");
            String nombreMateria = sc.next();

            //Crear materia
            Materia materia = new Materia(codigoMateria, nombreMateria);

            //Registro
            System.out.print("Ingrese el codigo del registro de nota: ");
            String codigoNota = sc.next();

            System.out.print("Ingrese la nota final: ");
            Float notaFinal = sc.nextFloat();

            //Crear Registro de Nota
            RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, notaFinal);

            System.out.println(registroNota);
            numMaterias++;
        }
       sc.close();
    }

    public static void main(String[] args) {
        int numMaterias = 1;
        Alumno alumno = generarAlumno();

        registrarNotas(alumno, numMaterias);
    }
}
