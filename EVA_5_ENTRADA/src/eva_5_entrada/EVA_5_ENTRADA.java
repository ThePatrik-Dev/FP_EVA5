/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_5_entrada;

import java.util.Scanner;

/**
 *
 * @author elmas
 */
public class EVA_5_ENTRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Alderete Aguirre Diego Joel
        
        String Nombre;
        
        //Incorporar esta herramienta
        Scanner Captura; 
        // Inexistente
        Captura = new Scanner(System.in);
        // Darle la interaccion
        System.out.println("Introduce tu Nombre; ");
        //Capturar / Asignar
        Nombre = Captura.nextLine();
        // Captura de todo el texto
        // Hasta que de ENTER
        
        System.out.println("----------------------------------");
        System.out.println("Datos Capturados");
        System.out.println(Nombre);
        
    }
    
}
