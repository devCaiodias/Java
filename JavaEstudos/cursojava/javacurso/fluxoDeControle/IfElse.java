package fluxoDeControle;

public class IfElse {
    public static void main(String[] args) {
        int idade = 10;

        if (idade < 0)
            System.out.println("idade Invalida");

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior idade");
        } else if (idade >= 70) {
            System.out.println("Terceira idade");
        } else if (idade > 0) {
            System.out.println("Menor idade");
        }
    }
}
