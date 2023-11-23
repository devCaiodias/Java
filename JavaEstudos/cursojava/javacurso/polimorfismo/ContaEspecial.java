package polimorfismo;

public class ContaEspecial extends ContaCorrente{
    private double limite;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();

        }
        saldo = saldo - valor;
    }
}
