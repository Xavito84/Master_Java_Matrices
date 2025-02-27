public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {

        int[][] matriz={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("matriz original");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int aux;
        for(int i=0; i<matriz.length; i++) {
            for (int j=0;j<1;j++) {
                aux= matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i]= aux;
            }
        }

        System.out.println("matriz transpuesta");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
