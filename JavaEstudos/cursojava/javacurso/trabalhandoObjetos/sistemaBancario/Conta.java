package trabalhandoObjetos.sistemaBancario;

import java.io.Serializable;

public class Conta implements Serializable{
    private int agencia;
    private int numero;
    private double saldo;

    private static final long serialVersionUID = 1L;

    public Conta() {
        
    
    }
    
        public int getAgencia(){
            return agencia;
        }

        public void setAgencia(int agencia){
            this.agencia = agencia;
        }
    
        public int getNumero(){
            return numero;
        }    

        public void setNumero(int numero){
            this.numero = numero;
        }

    public Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;

    }

    public void retirar(double valor){
        this.saldo = saldo - valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
