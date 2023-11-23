package polimorfismo;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaEspecial();

        try{
            conta.sacar(20);
        }catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }
    }
}
