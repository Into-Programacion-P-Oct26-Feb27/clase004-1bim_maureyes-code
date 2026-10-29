/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        String nombreEstudiante;
        String ciudadNacimiento;
        int anionacimiento;
        int edad;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();
        System.out.println("Ingrese nombre de asignatura 2");
        nombreAsignatura2 = entrada.nextLine();
        
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();
        //se necesita ingresar el año de nacimiento
        //se necesita ingresar la cuidad de nacimiento(entrada.nextInt())
        System.out.println("Ingrese ciudad de nacimiento");
        ciudadNacimiento = entrada.nextLine();
        
        System.out.println("Ingrese su ano de naciemiento");
        anionacimiento = entrada.nextInt();
      
        edad = 2026 - anionacimiento;
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2:%s\n "
                + "Nota 2: %.2f\nNombre de estudiante: %s\nCiudad de naciemiento %s\nEdad actual %s\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante,
                ciudadNacimiento,
                edad);
   
    }
    
}
