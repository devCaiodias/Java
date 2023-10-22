package cursojava.herança.superclasse;

public class Dadosclasse {
    public static void main(String[] args) {
        Veiculo v1=new Veiculo("Carro", 10);
        Veiculo v2=new Veiculo("Avião", 10);
        Aviao a1=new Aviao("Avião", 2);

        v1.info();
        v2.info();
        a1.info();
    }
}
