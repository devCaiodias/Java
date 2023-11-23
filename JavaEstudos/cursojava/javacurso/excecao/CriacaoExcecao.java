package excecao;

public class CriacaoExcecao {
    public static void main(String[] args) throws DivisaoPorZero{
        try{
            int val = 10 /0;
            System.out.println(val);
        }catch(Exception e){
            throw new DivisaoPorZero();
        }
    }
}
