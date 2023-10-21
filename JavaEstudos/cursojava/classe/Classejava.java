package cursojava.classe;

public class Classejava {

    //Public: Uma declaração com o modificador public pode ser acessada de qualquer lugar e por qualquer entidade que possa visualizar a classe a que ela pertence.

    //Private: Os membros da classe definidos como não podem ser acessados ou usados por nenhuma outra classe.

    public static void main(String[] args) {

        int num=0;

        Jogador j1 = new Jogador(++num);    //pos incremento: num++
        Jogador j2 = new Jogador(++num);    //pré incremento: ++num
        Jogador j3 = new Jogador(++num);

       /*  j1.num =10;
        j2.num =5;
        j3.num = 9;
        System.out.printf("%n%d",j1.num);
        System.out.printf("%n%d",j2.num);
        System.out.printf("%n%d",j3.num);
        */
        //j1.setVidas(2);
        //j2.setVidas(3);
        //j3.setVidas(1);

        j1.addVidas();
        j1.addVidas();
        j1.perderVidas();
        j1.addVidas();
        System.out.printf("%n Vidas do jogador 1: %d",j1.getVidas());
        System.out.printf("%n Vidas do jogador 2: %d",j2.getVidas());
        System.out.printf("%n Vidas do jogador 3: %d",j3.getVidas());
    }
}
