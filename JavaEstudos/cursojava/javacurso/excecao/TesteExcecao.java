package excecao;

public class TesteExcecao {
    public static void main(String[] args) {
        try{
            //Trecho onde a excecuçao pode ocorrer
     //       int val = 10 /0;
       //     System.out.println(val);
        }catch(Exception e){ //Capturar da excecao

            //Tratamento da excecuçao
            e.printStackTrace();
        }

        // Exceçoes Unchecked
        try{
            //int val2 = 10 /0;
            int[] valores = new int[3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");
        }catch(ArithmeticException e){

            System.out.println("Nao é possivel dividir um numero por ZERO.");

            //Mensagem com a lista de erros
            System.out.println(e.getMessage());
            //Imprimir a pilha de erro da excuçao
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("N é possivel acessar a posiçao 4 do array");
        }catch(NumberFormatException e){
           System.out.println("N foi possivel retorna o length, variavel nome n instancia !"); 
        }catch(Exception e){
            System.out.println("Erro na excecusao do programa.");
        }
        finally{
            System.out.println("Sempre sera execultado");
        }
    }
}
