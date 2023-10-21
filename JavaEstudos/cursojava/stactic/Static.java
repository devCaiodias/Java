package cursojava.stactic;

public class Static {

    //Os métodos static ou métodos da classe são funções que não dependem de nenhuma variável de instância, quando invocados executam uma função sem a dependência do conteúdo de um objeto ou a execução da instância de uma classe, conseguindo chamar direto qualquer método da classe e também manipulando alguns campos da classe.
    public static void main(String[] args) {
        int num=0;
        int pontos=2;

        for (int i = 0; i < pontos; i++) {
            
            Jogadorstatic.potos();
        }
      
        Jogadorstatic j1 = new Jogadorstatic(++num);
        Jogadorstatic j2 = new Jogadorstatic(++num);
        Jogadorstatic j3 = new Jogadorstatic(++num);
        Jogadorstatic j4 = new Jogadorstatic(++num);


        Jogadorstatic.alerta=true;
        
        j1.infor();
        j2.infor();
        j3.infor();
        j4.infor();

    }
}
