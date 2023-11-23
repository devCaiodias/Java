package operadoreAritmeticos;

public interface LogicosPartUm {
    public static void main(String[] args) {
        int idade = 19;
        boolean podeVotar = idade >= 18 && idade < 70; // AND

        System.out.println(podeVotar ? "Pode votar" : "Nao pode votar");

        int amarelo = 2, vermelho = 1;

        boolean suspenso = amarelo == 2 || vermelho == 1; // OR
        System.out.println(suspenso ? "VC foi expulso" : "Vc está no jogo ainda");
    }
}
