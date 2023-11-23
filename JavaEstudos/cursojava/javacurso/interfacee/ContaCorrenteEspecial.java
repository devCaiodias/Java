package interfacee;

import polimorfismo.ContaCorrente;
import polimorfismo.SaldoInsuficienteException;

public final class ContaCorrenteEspecial extends ContaCorrente implements Tranferivel{
    private double limite;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo -valor;
    }
    
    
    public double verificaSaldo(){
        return 0;
    }
    
    @Override
    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarDoc'");
    }

    @Override
    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTed'");
    }
    
}
