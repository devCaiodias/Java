package operadoreAritmeticos;

public class LogicoPartDois {
    public static void main(String[] args) {
        int x = 11, y = 11;
        boolean teste = x > 10 ^ y > 10; // XOR
        System.out.println(teste);

        int idade = 15;

        boolean maiorIdade = !(idade >= 18); // NOT
        System.out.println(maiorIdade);
    }
}
