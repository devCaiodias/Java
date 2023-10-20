package cursojava;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        
                     //FOR: Quando eu souber o tanto de vez que eu preciso para executar o comando.
       for(int cont= 0;cont < 5;cont++){
            System.out.println(cont + " - Curso de Java");
        }
        
        
                    //While; Quando n souber quantas vezes eu vou execultar esse comando  
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Dijite um numero: ");
        int max = scan.nextInt();
        int conta = 0;
        while (conta < max) {
            System.out.println( conta + " - Caio");
            conta++;
        }        

                    // Do WHILE
        int contador = 0;
        do {
            System.out.println(contador + " - Caio DIas");
            contador++;
        } while (contador < 0);

        System.out.println("Fim do Programa");




    }
}
