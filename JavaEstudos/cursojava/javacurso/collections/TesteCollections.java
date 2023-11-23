package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TesteCollections {
    public static void main(String[] args) {
        ArrayList carrinho = new ArrayList<>();
        double valor = 100.5;
        int valor2 = 1;
        int valor3 = 1;

        carrinho.add(valor);
        carrinho.add("Uva");
        carrinho.add(valor2);

        System.out.println(carrinho.get(1));
        System.out.println(valor3);

        List<String> carrinho2 = new ArrayList<String>();

        carrinho2.add("Maça");
        carrinho2.add("Morango");
        carrinho2.add("Maça");
        carrinho2.set(1, "Pera");

        System.out.println(carrinho2.isEmpty());
        System.out.println(carrinho2.size());

        List<String> carrinho3 = new ArrayList<String>();

        carrinho3.add("Maça");
        carrinho3.add("Morango");
        carrinho3.add("Maça");

        System.out.println(carrinho3.contains("Maça")); //se está em algum item do ArrayList
        System.out.println(carrinho3.indexOf("Maça")); //Mostra a posiçao que o item está
        System.out.println(carrinho3.get(carrinho3.indexOf("Maça"))); //Busca a palavra Maça da posisao retornada pelo metado indexOf.
        System.out.println(carrinho3.lastIndexOf("Maça")); //Mostra a utilma ocorencia que teve no ArrayList.

        carrinho3.remove(carrinho3.indexOf("Maça"));
        System.out.println(carrinho3.get(0));

        carrinho3.clear();
        System.out.println(carrinho3.isEmpty());
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
        Set<String> cesta = new HashSet<String>();

        System.out.println(cesta.isEmpty());
        cesta.add("Maca");
        cesta.add("Maca");
        cesta.add("maca");
        System.out.println(cesta.isEmpty());

        System.out.println(cesta.size());
        System.out.printf("%s %n", cesta);

//---------------------------------------------------------------------------------------------------------------------------------------------------
        Map <String ,String> caixa = new HashMap<String, String>();        


        caixa.put("M174485", "Fernado");
        caixa.put("M158846", "CAio");
        caixa.put("M177485", "Valdo");

        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("M174485"));
        System.out.println(caixa.containsValue("Fernado"));
        System.out.printf("%n %s", caixa);
    }
    
}
