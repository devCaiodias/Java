package cursojava.herança.superclasse;

public class Veiculo {
    private String name;
    private int tipo=0;

    public Veiculo(String name, int tipo){
        this.name=name;
        this.tipo=tipo;
    }

    public void info(){
    System.out.printf("---------------------%n");
    System.out.printf("Name ..... %s %n", this.name);
    System.out.printf("Tipo .... %d %n", this.tipo);

    }   
}
