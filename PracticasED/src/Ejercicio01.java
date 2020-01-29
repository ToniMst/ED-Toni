
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anton
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inicio: ");
        int inicio = Integer.parseInt(sc.nextLine());
        System.out.print("Fin: ");
        int fin = Integer.parseInt(sc.nextLine());

        for (int i = inicio; i < fin; i++) {
            
            
            boolean primo = esPrimo(i);
            
              if (primo) { 
            System.out.println( i + " si es primo ");
        }else{
                  System.out.println(i + " no es primo");
              }
        
      
            
        }

    }

    public static boolean esPrimo(int num) {
        boolean resultado = true;
        for (int i = 2; i < num-1; i++) {
            if (num % i !=0) {
                resultado = true;
            }else{
                resultado = false;
                break;
                
            }
            
            

        }
        
        
        
        return resultado;
    }

}
