package EjerciciosConArrays;

import utilidades.ES;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Amarico
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] resultado = new int[10];
        int contador = 0;

      

            for (int i = 0; i < numeros.length; i++) {
                contador++;
                numeros[i] = ES.leeEntero("Introdue los números");
                
            }
            System.out.print("Indice--> ");
            for (int i = 0; i < numeros.length; i++) {
                
                System.out.print(numeros[i] + " ");
            
        }

        
        
        

    }
}