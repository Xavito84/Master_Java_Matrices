import java.util.Scanner;

public class Tarea18 {
    /*Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño
    de la letra para imprimir en una matriz de n x n.

    El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

    Por ejemplo para n=5 se obtiene:

    X___X
            _X_X_
    __X__
            _X_X_
    X___X

    Por ejemplo para n=6 se obtiene:

    X____X
            _X__X_
    __XX__
            __XX__
    _X__X_
            X____X

    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la X (n): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        // Crear la matriz de tamaño n x n
        char[][] matriz = new char[n][n];

        // Llenar la matriz con guiones bajos '_'
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '_';
            }
        }

        // Colocar las 'X' en las diagonales
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 'X';           // Diagonal principal
            matriz[i][matriz.length - i - 1] = 'X';   // Diagonal secundaria
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el tamaño de la matriz (n x n): ");
    int n = scanner.nextInt();

    if (n == 0) {
        System.out.println("ERROR");
        System.exit(1);
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j || (j == n - i - 1)) {
                System.out.print("X");
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}

}*/
