public class EjemploMatrizSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;
        int [][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i, j;

       /* while (i< matriz.length && simetrica== true) {
            j=0;
            while (j< matriz[i].length && simetrica== true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica=false;
                }
                j++;
            }
            i++;
        }*/

        salir:
        /*while(i< matriz.length){
            j=0;
            while (j< matriz[i].length && simetrica== true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica=false;
                    break salir;
                }
                j++;
            }
            i++;
        }*/

        salir2:
            for ( i=0; i< matriz.length; i++){
                for ( j=0; j< matriz[i].length; j++){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica= false;
                        break salir2;
                    }
                }
            }


        if(simetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }


    }
}
