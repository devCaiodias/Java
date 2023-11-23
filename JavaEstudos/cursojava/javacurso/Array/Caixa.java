package Array;

public class Caixa {
    public static void main(String[] args) {
        float[] valores = new float[5];

        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;
        valores[3] = 40;
        valores[4] = 50;

        float[] valores2 = new float[] {10,20,30,40,50};

        System.out.println(valores2[4]);
        System.out.println(valores[0]);

        Produtos[] produtos = new Produtos[2];

        Produtos prot1 = new Produtos();
        prot1.setName("Limao");
        prot1.setDescricao("Azerdo");
        prot1.setValores(10);

        Produtos prot2 = new Produtos();
        prot2.setName("Morango");
        prot2.setDescricao("Docinho");
        prot2.setValores(20);

        produtos[0] = prot1;
        produtos[1] = prot2;

        for (Produtos prod : produtos) {
            System.out.println(prod.toString());
        }

        // System.out.println(produtos[0].getName());
        // System.out.println(produtos[1].getName());


        //10 corredores com trés prateleiras cada.
        Produtos[][] localizarProduto = new Produtos[10][3];

        localizarProduto[0][1] = prot1;
        localizarProduto[1][1] = prot2;

        System.out.println(localizarProduto[0][1].getName());
    }
}
