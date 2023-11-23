package lacodeRepeticao;

public class Caixa {
    public static void main(String[] args) {
        
        int qtdProduto = 5;
        int registro = 0;

        // while (registro < qtdProduto) {                      //While
        //     registro++;                                
        //     System.out.printf("o produto numero %d foi registrado %n", registro);
        // }
        
        do {                                                    //DoWhile
            registro++;
            System.out.printf("o produto numero %d foi registrado %n", registro);
            
        } while (registro < qtdProduto);
        
        for (int i = 1; i <= qtdProduto; i++) {
            System.out.printf("o produto numero %d foi registrado %n", i);
            
        }
    }
}
