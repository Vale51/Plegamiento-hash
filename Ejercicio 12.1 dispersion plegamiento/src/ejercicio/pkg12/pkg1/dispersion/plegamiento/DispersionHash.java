/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg1.dispersion.plegamiento;



import java.util.LinkedList;

public class DispersionHash {
   
  static final int M = 1024; 
  
  static long transformaClave(String clave) {
    long d;
    d = 0;
    for (int j = 0; j < Math.min(clave.length(),10); j++) {
      d = d * 27 + (int)clave.charAt(j);
    }
    if (d < 0) d = -d;
    
    System.out.println("valor de d " + d);
    
    return d;
  }
  
  
  int plegamiento(long d){
    int arrNums[] = new int[5]; // guarda los grupos de digitos
    int resultado = 0;
    
    LinkedList<Long> listDigitos = new LinkedList<>(); //guarda los digitos 
      
    while(d > 0){ //llenar listDigitos con digitos
        listDigitos.push(d % 10); 
        d = d / 10;
    }
        
    for(int i=0; i<5; i++){ //en cada posicion de arrNums se guardan 3 digitos
        for(int j=0; j<3; j++){
            if(!listDigitos.isEmpty()){ //evita operar sin elementos 
                arrNums[i] += listDigitos.pop().intValue()*Math.pow(10,j); //convierte el digito a int y lo guarda, multiplicando por potencia de 10
            }
        }
        resultado += arrNums[i]; //se acumulan los valores en arrNums
    }
    
    
    while(resultado>M){
        resultado -= 1000; //si el resultado supera el valor de M, se resta 1000
    }
  
    return resultado;
  }

}
