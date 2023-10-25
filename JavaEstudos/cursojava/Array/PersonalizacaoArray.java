package cursojava;

import cursojava.herança.Carro;

public class PersonalizacaoArray {

    public static void main(String[] args) {
        final int numCarro= 5;
        Carro[]  carros=new Carro[numCarro];
        String[] nomeCarros={"Ferrari","Porch","Lamborgine","Camaro","Dotcharg"};
    
        //Inicializar o array Carros
        for (int i = 0; i < numCarro; i++) {
            carros[i]=new Carro(nomeCarros[i]);
            
        }

        //Imprimir Carros
        for (Carro c: carros) {
            c.info();
        }
        
    }
}
