package variaveljava;

public class VariavelPartDois {
    public static void main(String[] args) {
        
        int x =10; //declaração de uma variável do tipo int
        double d= x; //variável double recebe um tipo int
        long l=x; //variável long recebe um tipo int
        float f= x; //variável float recebe u um tipo int (atenção)
        short s = 20; //declaração de uma variável do tipo short
        x = s; //variável int recebe um tipo short

        //System.out.println(x);

        double valorDouble= 9.99;
        int valorInt= (int) valorDouble; //Convertendo o double para um numero inteiro 9.99(9).
        System.out.println(valorInt);
    }
}
