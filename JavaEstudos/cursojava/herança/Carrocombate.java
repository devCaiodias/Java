package cursojava.herança;

public class Carrocombate extends Carro{
    private final int MaxArmamrnto = 100;
    private final int MinArmamento= 0;
    private int qtdArmamento=0;

    public Carrocombate (String nome, int blindaguem){
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindaguem);
        this.qtdArmamento = 100;
        
    }

    public int getqtdArmamento(){
        return this.qtdArmamento;
    }

    public void setqtdArmamento(int qtdArmamento){
        this.qtdArmamento +=qtdArmamento;
        if (this.qtdArmamento > MaxArmamrnto) {
            this.qtdArmamento =MaxArmamrnto;
        }else if(this.qtdArmamento < MinArmamento){
            this.qtdArmamento = MinArmamento;
        }
    }

    public void atirar(){
        if(this.qtdArmamento > MinArmamento ){
            setqtdArmamento(-1);
        }else{
            System.out.println("Sem balas ");
        }
    }

    public void info(){
       super.info();
       System.out.printf("QTD.Armamento '... : %d %n", this.qtdArmamento);
    }

}
