package cursojava.classe;


public class Jogador{
    
    private final int maxVidas= 3;
    private final int minVidas = 0;
    private int pessoas=0;
    private int vidas=0;

    public Jogador(int num){
        this.pessoas=num;
        this.vidas=1;

        System.out.printf("Jogador numero %d criado%n", pessoas);
    }

    public int getVidas(){
        return this.vidas; //Quando formos acessar, “pegar” alguns atributos da classe, devemos utilizar os métodos GET
    }

    public void setVidas(int vidas){
        if (vidas > maxVidas) {
            this.vidas=maxVidas; //Para alterarmos, modificarmos os valores de um atributo da classe de maneira protegida, utilizamos os métodos SET.
        }else if (vidas < minVidas) {
            this.vidas=minVidas;
        }else{

            this.vidas =vidas;
        }
        
    } 
    public void addVidas(){
        if (this.vidas < maxVidas) { //Metodod Set
            this.vidas++;
        }

    }

    public void perderVidas(){
        if (this.vidas > 0) {
            this.vidas--;        //Metodod Set
        }
    
    }
}

