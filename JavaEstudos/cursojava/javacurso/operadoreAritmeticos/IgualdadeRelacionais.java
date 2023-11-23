package operadoreAritmeticos;

public class IgualdadeRelacionais {
    public static void main(String[] args) {
        int idade= 20;
        boolean maiorIdade = idade > 18;

        System.out.println(maiorIdade);

        Igual();
        Diferente();
    }

    public static void Igual(){
        int idade= 18;
        boolean maiorIdade = idade == 18;

        System.out.println(maiorIdade);
    }

    public static void Diferente(){
        int idade = 28;
        if (idade > 18) {
            System.out.println("Ele já é um cresido");
        } else {
            System.out.println("Uma criança ainda.");
        }
    }
}
