package metado;

public class Conta {
    double saldo;
    
    public double recuperarSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //Sobrecarga


    public void retirar(double valor){
        saldo = saldo - valor;
    }
    
    public void retirar(double valor, double taxa){
        saldo = saldo - valor - taxa;
    }
    
    int agencia;
     
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
}
