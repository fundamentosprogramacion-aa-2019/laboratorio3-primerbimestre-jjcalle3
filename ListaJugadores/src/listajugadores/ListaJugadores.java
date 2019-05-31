/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajugadores;

import java.util.Scanner;

/**
 *
 * @author COMPUMARS
 */
public class ListaJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int goles = 0;
        double sueldo = 0;
        int totalGoles = 0;
        double totalSueldo = 0;
        double promedioSueldo = 0;
        String cadena = "";
        String nombre = "";
        String apellido = "";
        String valor = "";
        int contador = 0;
        boolean opcion = true;
            cadena = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t\n", 
                    cadena, "nombre", "apellido", "goles", "sueldo");
        while (opcion==true) {
            
            contador = contador + 1;
            
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
        
            System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese el número de goles");
            goles = entrada.nextInt(); 
            totalGoles = totalGoles + goles;
            
            
            System.out.println("Ingrese la cantidad del sueldo");
            sueldo = entrada.nextDouble();
            totalSueldo = totalSueldo + sueldo;
            entrada.nextLine();
            
            System.out.println("Ingrese f si desea salir");
            valor = entrada.nextLine();
            
            cadena = String.format("%s%s\t\t\t%s\t\t\t%d\t\t\t%.2f\n", 
                    cadena, nombre, apellido, goles, sueldo);
            
            
            if (valor.equals("f")) {
                opcion = false;
            }
        }
        
        promedioSueldo = totalSueldo/contador;
        
        cadena = String.format("%s total Goles: %d\n promedio Sueldo %.2f\n", 
                cadena, totalGoles, promedioSueldo);
        
        
        System.out.printf("%s\n", cadena);
        
                
        // TODO code application logic here
    }
    
}
