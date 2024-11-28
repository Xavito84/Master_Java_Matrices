import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[8][4];
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.print("Número que quieres imprimir por pantalla (0 a 9): ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 9) {
            System.err.println("ERROR");
            System.exit(1);
        }

        // Inicializar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = " ";
            }
        }

        // Dibujar número en la matriz
        switch (numero) {
            case 0:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (j == 0 || j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;

            case 1:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;

            case 2:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0) {
                            matriz[i][j] = "-";
                        } else if (i == filas / 2) {
                            matriz[i][j] = "-";
                        } else if (i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (i < filas / 2 && j == columnas - 1) {
                            matriz[i][j] = "|";
                        } else if (i > filas / 2 && j == 0) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;

            case 3:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i == filas / 2 || i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == filas / 2) {
                            matriz[i][j] = "-";
                        } else if (i < filas / 2 && j == 0 || j == columnas - 1) {
                            matriz[i][j] = "|";

                        }
                    }
                }
                break;
            case 5:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i == filas / 2 || i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (i < filas / 2 && j == 0 || i > filas / 2 && j == columnas - 1) {
                            matriz[i][j] = "|";
                        }

                    }
                }
                break;
            case 6:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i == filas / 2 || i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (j==0 || i > filas / 2 && j == columnas - 1) {
                            matriz[i][j] = "|";
                        }

                    }
                }
                break;
            case 7:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 ) {
                            matriz[i][j] = "-";
                        } else if (j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;
            case 8:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i== filas/2 || i == filas - 1) {
                            matriz[i][j] = "-";
                        } else if (j == 0 || j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;
            case 9:
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (i == 0 || i== filas/2) {
                            matriz[i][j] = "-";
                        } else if (i<filas/2 && j==0||j == columnas - 1) {
                            matriz[i][j] = "|";
                        }
                    }
                }
                break;
            default:
                System.out.println("Número no soportado.");
                System.exit(1);
        }

        // Imprimir matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
