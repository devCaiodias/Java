package cursojava;

import java.util.Scanner;

public class Arryjava {
    public static void main(String[] args) {
        //Array

        final int tam=5;

        int[] num=new int[tam];
        int[] numero={50,60,41,25,8};

        num[0]=10;
        num[1]=20;
        num[2]=60;
        num[3]=70;
        num[4]=40;

          for(int i=0;i < numero.length;i++){
        System.out.printf("%d - ", numero[i]);

        }

        //Execio

        final int tamanho = 5;
        char[] gabarito ={'A','A','B','B','C'};
        char[] respostasaluno =new char[tamanho];
        int nota=0;
        Scanner scan= new Scanner(System.in);

        for(int i=0;i < tamanho;i++){
            System.out.printf("Informe a respostas %d: ", i);
            respostasaluno[i]=scan.nextLine().charAt(0);
        }

        for(int i=0;i < tamanho;i++){
            if(respostasaluno[i]==gabarito[i]){
                nota++;
            }
        }
        System.out.printf("Nota do aluno: %d", nota);
    }
}
