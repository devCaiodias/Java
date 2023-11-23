package construtores;

public class TesteConta {
    public static void main(String[] args) {
        Conta cc = new Conta(111,50.0);

        System.out.println(cc.recuperarSaldo());
        System.out.println(cc.recuperarNumero());
    }
}
