package cursojava;

import java.lang.Double;

public class Metodosjava {
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            canal("Caio dias",2);
        }

        int rSoma3= soma3(10, 10, 10);
        int rSoma= soma(1,8,1,10,50,100);
        double rsomad= soma(1.2,1.2);

        System.out.println(rSoma);
        System.out.println(rSoma3);
        System.out.print(rsomad);

    }

    public static int soma(int... n){
        int res=0;
        for (int i : n) {
            res+=i;
        }
        return res; 
    }

    public static Double soma(Double... n){
        Double res=0.0;
        for (Double i : n) {
            res += i;
        }
        return res;
    }

    public static int soma3(int n1,int n2, int n3){
        int res=n1+ n2 + n3;
        return res;                     //Parametro de Saida
    }

    public static void canal(String m, int l){
        for (int i = 0; i < l; i++) {
                                            //Parametro de Entrada
            System.out.println(m);
        }
    }
}
