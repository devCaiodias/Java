package construtores;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(){
        
    }

    public Conta(int numero){
        this.numero = numero;
    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public Conta(int numero, double saldo){   //Construtor 
        this.numero = numero;
        this.saldo = saldo;
    }

    public double recuperarSaldo(){
        return saldo;
    }

    public int recuperarNumero(){
        return numero;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void setNumero(int numero){
        this.numero = numero; //Setar um novo numero para conta
    }

    public int getNumero(){
        return numero;  // Obter o numero da conta 
    }
}
