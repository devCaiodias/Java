package cursojava.herança.superclasse;

public class Aviao extends Veiculo{
    private int categoria;

    public Aviao(String name,int categoria){
        super(name, 10);
        this.categoria=categoria;
    }

    public void info(){
        super.info();
        System.out.printf("Categoria ..... %d %n",this.categoria);
    }
}
