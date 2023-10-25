package cursojava;

import java.lang.reflect.Array;

public class Arrayex {
    public static void main(String[] args) {
        final int tamanho= 7;
        int[] num=new int[tamanho];
        int[] numero={50,78,95,46,14,100};

        num[0] = 5;
        num[1] = 3;
        num[2] = 8;
        num[3] = 10;
        num[4] = 6;
        num[5] = 111;
        num[6] = 498;

        for (int i = num.length - 1;i >= 0  ; i--) {
           
            System.out.printf("%n %d %n", num[i]);
       }

        for (int n : num ) {
            System.out.printf("%n :%d  %n", n);
            
        }
        
        for (int i : numero) {
            System.out.printf("%n :%d  %n", i);
        }
    }
}
