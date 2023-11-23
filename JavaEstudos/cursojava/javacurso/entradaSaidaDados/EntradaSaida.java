package entradaSaidaDados;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {

        int idade = 0;
        String nome;

        Scanner scan = new Scanner(System.in);
        System.out.printf("Dijite seu nome: ");
        nome = scan.nextLine();

        System.out.printf("Dijite sua idade: ");
        idade = scan.nextInt();

        if (idade >= 18 && idade < 70) {
            System.out.printf("Seu nome é %s &n", nome);
            System.out.println("Maior idade");
        } else if (idade >= 70) {
            System.out.printf("Seu nome é %s %n", nome);
            System.out.println("Terceira idade");
        } else if (idade > 0) {
            System.out.printf("Seu nome é %s %n", nome);
            System.out.println("Menor idade");
        }
    }   
}
