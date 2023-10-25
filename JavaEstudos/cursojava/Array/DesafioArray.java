package cursojava;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        final int qtdPerguntas = 5;
        int pontosPergunta=2;
        char[] gabarito={'a','b', 'b','a','b'};
        String[] perguntas={
            "O sol é uma estrala?",
            "Quanto que é 2 + 2?",
            "Java e a mesma coisa que JavaScript",
            "A bola ela pinga?",
            "Anime é um dezenho?"
        };
    
        String[] alternativas={
            "a)Sim |  b)Nao  | c)Talvez ",
            "a)2  | b)4  |  C)8",
            "a)Sim |  b)Nao  | c)Talvez ",
            "a)Sim |  b)Nao  | c)Talvez ",
            "a)Sim |  b)Nao  | c)Talvez ",
        };
        char[] respostas=new char[qtdPerguntas];
        char resp;
        int nota=0;
        String aluno;
    
        System.out.printf("Dijite o nome do Aluno: ");
        aluno= scan.nextLine();
        for (int i = 0; i < qtdPerguntas; i++) {
            System.out.printf("----------------------");
            System.out.printf("Pergunta: %d%n", i + 1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=scan.nextLine().charAt(0);
            respostas[i]=resp;
        }

        System.out.printf("%s%n", "Fim da prova confira os resultados");

        for (int i = 0; i < qtdPerguntas; i++) {
            if (gabarito[i] == respostas[i]) {
                nota+=pontosPergunta;
            }
        }
        System.out.printf("%s sua nota %d, seu resultado foi %s", aluno,nota,nota>=6 ? "Aprovado" : "Reprovado" );
    }

}
