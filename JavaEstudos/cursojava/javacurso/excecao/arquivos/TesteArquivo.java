package excecao.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {
    public static void main(String[] args) throws IOException {
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "/javacurso/excecao/coisa.txt";

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da unidade");
        conteudo.add("Pera: 200; ptc; 5.40");
        conteudo.add("Morango: 400; ptc; 6.40");
        conteudo.add("Abacaxi: 200; un; 5.00");
        

        try (FileWriter stream = new FileWriter(caminho);
             PrintWriter print = new PrintWriter(stream)) {

            for (String linha : conteudo) {
                print.println(linha);
            }

            System.out.println("O arquivo foi salvo em: " + caminho);

        } catch (IOException e) {
            e.printStackTrace();
        }

        File arquivoss = new File(caminho);

        if (arquivoss.exists()) {
            System.out.printf("O arquivo existe! ");
            System.out.printf("%nPode ser lido: %s", arquivoss.canRead());
            System.out.printf("%nPode ser gravado: %s", arquivoss.canWrite());
            System.out.printf("%nTamanho: %d", arquivoss.length());
            System.out.printf("%nCaminho: %s", arquivoss.getPath());

        }else{
            try{
                if (arquivoss.createNewFile()) {
                    System.out.println("Arquivo criado!");

                }else{
                    System.out.println("Arquivo n criado!");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        File fDiretorio = new File(diretorio);

        if (fDiretorio.exists()) {
            System.out.println("\nExiste o diretorio");
        }
    }
}
