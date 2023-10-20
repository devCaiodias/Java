package cursojava;
import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 =0, n2= 0, n3= 0, n4=0, soma=0;
        final int media= 60;
        String nome ="", res="";

        System.out.print("Dijite o nome do aluno: ");
        nome = scan.nextLine();
        System.out.print("Dijite a primeira nota do aluno: ");
        n1 = scan.nextInt();
        System.out.print("Dijite a segunda nota do aluno: ");
        n2 = scan.nextInt();
        System.out.print("Dijite a terceira nota do aluno: ");
        n3 = scan.nextInt();
        System.out.print("Dijite a quarta nota do aluno: ");
        n4 = scan.nextInt();
        soma = n1 + n2 + n3 + n4;

        if (soma >= media) {
            res = "Aprovado" ;
        }else if (soma <= 40) {
            res = "Recuperação";
        }else{
            res = "Reprovado";
        }

        System.out.printf("Aluno %s foi %s, com nota %d",nome,res, soma);
    }
}
