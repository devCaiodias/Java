package trabalhandoObjetos.sistemaBancario;

public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(){

    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getCheque(){
        return chequeEspecial;
    }

    public void setCheque(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo(){
        return super.getSaldo() + chequeEspecial;
    }

    public void retirada(double valor){
        valor +=10;
        super.retirar(valor);
    }

    public double getMultiplicarSaldo(){
        return super.getSaldo() * chequeEspecial;
    }
}
