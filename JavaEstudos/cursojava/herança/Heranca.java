package cursojava.herança;

public class Heranca {
   
 /*A herança é um princípio da POO que permite a criação de novas classes a partir de outras previamente criadas. 
 Essas novas classes são chamadas de subclasses, ou classes derivadas; e as classes já existentes, 
 que deram origem às subclasses, são chamadas de superclasses, ou classes base.   */
    public static void main(String[] args) {

        Carro c1 =new Carro("Ferrari");
        Carro c2 =new Carro("Lamborgini");
        Carrocombate c3 = new Carrocombate("Bat-Movel", 100);
        Carrocombate c4 = new Carrocombate("Kuruma" ,100);
        c1.setLigado(true);
        
        
        c3.atirar();
        c3.atirar();
        c3.atirar();
        
        
        c4.sofrerDano(150);
        c2.sofrerDano(10);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
   
}
