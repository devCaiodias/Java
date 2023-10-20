package cursojava;

import java.security.SecureRandom;

public class Matrizes {
    public static void main(String[] args) {
        final int linhas= 3;
        final int colunas= 5;

        int[][] numeros=new int[linhas][colunas];

        int[][] num ={{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}};

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                numeros[i][j] = new SecureRandom().nextInt(100); 
            }
        }

       /*  for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d -  ", numeros[i][j]);
            }
            System.out.printf("%n");
        }*/

        for (int[]  n: num) {
            for (int v : n) {
                System.out.printf("%3d - ", v);
            }
            System.out.printf("\n");
        }
    }
}
