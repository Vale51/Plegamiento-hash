/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.pkg1.dispersion.plegamiento;

/**
 *
 * @author user
 */

import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String clave;
	long valor;

        DispersionHash dispersor = new DispersionHash();
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        for (int k = 1; k <= 10; k++) {
   
          System.out.print("\nClave a dispersar: ");
          clave = entrada.readLine();

  
          valor = dispersor.transformaClave(clave);

          valor = dispersor.plegamiento(valor);

          System.out.println("Dispersion de la clave " + clave + " \t " + valor);
        
        }
    
    }
}
