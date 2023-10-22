package cursojava.herança;

public class Carro {
    private String nome;
    private boolean ligado;
    private boolean destruido;
    private int blindaguem= 0;
    private boolean armamento;

    public Carro(String nome){
        this.nome=nome;
        this.ligado=false;
        this.destruido=false;
        this.blindaguem=0;
        this.armamento=false;
    }

    public String getName(){
        return this.nome;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public boolean getDestruido(){
        return this.destruido;
    }
    
    public void setDestruido( boolean destruido){
        this.destruido=destruido;
    }

    public boolean getArmamento(){
        return this.armamento;
    }

    public void setArmamento(boolean armamento){
        this.armamento = armamento;
    }

    public int getBlindagem(){
        return this.blindaguem;
    }

    public void setBlindagem(int blindaguem){
        this.blindaguem=blindaguem;
    }

    public void sofrerDano( int dano){
        this.blindaguem -=dano;
        if (this.blindaguem <=0) {
            this.blindaguem = 0;
            this.ligado = false;
            this.destruido=true;
        }
    }

    public void info(){
 
        System.out.printf("---------------------- %n");
        System.out.printf("Nome... : %s %n", this.nome);
        System.out.printf("Ligado... : %s %n", this.ligado ? "Sim" : "Não");
        System.out.printf("Destruido... : %s %n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem... : %d %n", this.blindaguem);
        System.out.printf("Armamento... : %s %n", this.armamento ? "Sim" : "Não");
    }
}
