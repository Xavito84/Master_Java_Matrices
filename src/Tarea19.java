import java.util.Scanner;

public class Tarea19 {
    /*
    Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio.
    El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.

Por ejemplo para n=5 se obtiene:

    10000
    10000
    11111
    10001
    10001

Por ejemplo para n=6 se obtiene:

    100000
    100000
    100000
    111111
    100001
    100001

Por ejemplo para n=10 se obtiene:

    1000000000
    1000000000
    1000000000
    1000000000
    1000000000
    1111111111
    1000000001
    1000000001
    1000000001
    1000000001

Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n * n)");

        int n= sc.nextInt();

        if (n== 0){
            System.out.println("ERROR");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j==0 || i==n/2){  //Asigna 1 si está en la primera columna o en la fila media.
                    matriz[i][j] = 1;
                } else if (i> n/2 && j== n-1) { //// Verifica si está en una fila inferior (después de la fila media) y en la última columna.
                    matriz[i][j]=1;  // Asigna 1 si está en la última columna de las filas inferiores.
                }else {
                    matriz[i][j]=0;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }


    }
}


/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        // llenamos la matriz de n x n con la figura de una silla en base al
        // numero 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }

        // recorremos e mostramos los elementos de la matriz para imprimir la
        // figura de una silla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

}
 */


