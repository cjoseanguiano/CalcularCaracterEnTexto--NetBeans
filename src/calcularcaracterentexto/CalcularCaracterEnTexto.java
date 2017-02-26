/*
PROGRAMA JAVA QUE CALCULE EL NÚMERO DE VECES QUE APARECE UN DETERMINADO CARÁCTER 
DENTRO DE UN TEXTO.


 */
package calcularcaracterentexto;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class CalcularCaracterEnTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        String texto;
        char caracter;
        int numeroVeces = 0;

        do {
            System.out.println("Introduce texto");
            texto = entrada.nextLine();
        } while (texto.isEmpty());
        System.out.println("Introduce caracter");
        caracter = (char) System.in.read();
        numeroVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + "'" + caracter + "'" + " aparece " + numeroVeces + " veces ");
    }

    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;

        posicion = cadena.indexOf(caracter);
        {
            while (posicion != -1) {
                contador++;
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
        }
        return contador;
    }
}
