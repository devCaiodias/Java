package cursojava.stactic;

public class Jogadorstatic {

    private int pessoas=0;
    static boolean alerta=false;
    static int qtdJogador=0;
    private int vidas=1;
    static int postosJogadores=0;


    public Jogadorstatic(int num){
        this.pessoas=num;
        System.out.printf("%nJogador numero %d criado %n",pessoas);
        qtdJogador++;
    }

    public int getVidas(){
        return this.vidas;

    }

    static void potos(){
        postosJogadores+=10;
    }


    public void infor(){
        System.out.printf("%n Jogador numero %d", pessoas);
        System.out.printf("%n Vidas: %d ", this.vidas);
        System.out.printf("%n Alerta: %s",alerta ? "Sim" : "Não");
        System.out.printf("%n Jogadores: %d",qtdJogador);
        System.out.printf("%n Pontos Jogadores: %d",postosJogadores);
        System.out.printf("%n----------------------");
        
    }
}
