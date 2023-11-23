package operadoreAritmeticos;

public class OperadorAtribuicao {
    public static void main(String[] args) {
        int x = 10;
        x = x + 20;

        System.out.println(x);

        int y= 10;
        y += 15;
        System.out.println(y);

        int G= 10;
        G -= 15;
        System.out.println(G);

        int H= 10;
        H *= 15;
        System.out.println(H);
        
        int K= 10;
        H /= 15;
        System.out.println(K);

        int L= 10;
        H %= 15;
        System.out.println(L);
    }
}
