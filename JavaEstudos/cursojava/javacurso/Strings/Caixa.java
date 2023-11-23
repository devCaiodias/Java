package Strings;

public class Caixa {
    public static void main(String[] args) {
        String nome; //Declaramos uma variavel do tipo String
        nome = new String(); //Intanciamos essa variavel
        nome = "Maça"; //Inicializamos essa variavel
        System.out.println(nome);

        String nome2 =new String("Maça");  //Declaramos e Intanciamos e inicializar a variavel
        System.out.println(nome2);

        String nome3 = "Maça";  // Apenas a declaraçao e atribuiçao do nome "Maça" a ela;
        System.out.println(nome3);



        //----------------------------------------------------------------------------------------
        String descrision = "Tipo Gala A \n maça mais doce do mercado"; //Faz uma quebra de linha
        System.out.println(descrision);

        String descrision2 = "Tipo Gala \tA maça mais doce do mercado"; // Cria um espacamento utilizando um tab
        System.out.println(descrision2);

        String descrision3 = "Tipo Gala \"A maça mais doce do mercado\""; //Da uma atribuiçao de aspas duplas, 
        System.out.println(descrision3);                                  //sem interferir nas aspas do inicializador.



        // ------------------------------------------------------------------
        String propaganda = nome + " " + descrision; //Usando o sinal de (+) para concatenar
        System.out.println(propaganda);

        propaganda = nome.concat(" ").concat(descrision); //Usando o metado (concat) para concatenar
        System.out.println(propaganda);

        propaganda += "!";      //Usando o operador de atribuiçao (+=) para concatenar
        System.out.println(propaganda);


    }
}
