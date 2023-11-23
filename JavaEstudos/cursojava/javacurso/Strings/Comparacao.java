package Strings;

public class Comparacao {
    public static void main(String[] args) {
        String nome = new String("Maça");
        String nome2 = new String("maça");
        String nome3 = new String("Maça");


        System.out.println(nome.equals(nome2)); //False //Porque elas sao diferente (nome:Maça) e (nome2:maça).

        System.out.println(nome.equalsIgnoreCase(nome2)); //True //vai ignorar os caracteris Maiusculos (M) e minusculos (m)

        System.out.println(nome.equals(nome3)); //Treu

        boolean teste = (nome == nome3);
        System.out.println(teste);

        String nome4 = "maça";
        String nome5 = "maça";

        teste = (nome4 == nome5);
        System.out.println(teste);

        String descrision = new String("Maça Gala, é a mais doce do merdado");

        System.out.println(descrision.length());
        System.out.println(descrision.startsWith("Maça")); //para saber se ele inicia com a paralavra (Maça) no começo. 
        System.out.println(descrision.endsWith("merdado")); //para saber se ele termina com a paralavra (merdado) no final
        System.out.println(descrision.charAt(0));
        System.out.println(descrision.indexOf("G"));
        System.out.println(descrision.indexOf("a"));
        System.out.println(descrision.lastIndexOf("a"));

        System.out.println(descrision.replace("G", "g"));
        System.out.println(descrision.replace("Gala", "Fugi"));
        System.out.println(descrision.split(" ").length);
        System.out.println(descrision.toLowerCase());
        System.out.println(descrision.toUpperCase());
        System.out.println(descrision.substring(0,4));
        System.out.println(descrision.substring(4));

        System.out.println(descrision.substring(
            descrision.indexOf("Maça"),
            descrision.indexOf(" ")));

            System.out.println(descrision);


    }
}
