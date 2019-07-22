package EjerciciosConArrays;

import java.util.Scanner;
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
        
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] resultado = new int[10];
        int posicionInicial=0;

        int posicionFinal;

        boolean valido = true;

        for (int i = 0; i < numeros.length; i++) {
            //contador++;
            numeros[i] = ES.leeEntero("Introdue los números");

        }

        //Muestra el array original (Indice)
        System.out.print("Indice----> ");
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(i + " ");

        }
        System.out.println("");
        System.out.print("Valor ----> ");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");

        }
        //pide las posiciones inicial y final
        do {
            
            valido  = true;
            
            System.out.println("Introduzca la posición inicial (0-9");
            posicionInicial = entrada.nextInt();
            
            //Valido el número introducido por teclado
            
            if ((posicionInicial<0) || (posicionInicial > 9)) {
                
                System.out.println("Valor incorrecto, debe ser un número entre 0 y 9");
                valido = false;
            }
            
            System.out.println("Introduzca la posción final (0-9)");
            
            posicionFinal = entrada.nextInt();
            
            if((posicionFinal<0 ) || (posicionFinal >0)) {
                System.out.println("Valor incorrecto, debe ser un número entre 0 y 9");
                
                valido = false;
                
            }
            if(posicionInicial >= posicionFinal){
                System.out.println("Valores incorrectos, la posición inicial debe ser menor que la posición final.");
                
                valido = false;
            }
            
        } while (!valido);

    }
}
