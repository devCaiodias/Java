package cursojava;

public class Decisao {
    public static void main(String[] args) {
        int nota=60;
        int faltas =10;
        int maxFaltas =5;
        int media = 60;

        //Condição Ternaria 
        String res;
        res =(nota >= media ? "Aprovado" : "Reprovado");

        System.out.println("Resultado: " + res);
 //--------------------------------------------------------------------------------------------

        //Condição com if and else
        if (nota >= media && faltas <= maxFaltas) {
            System.out.println("Aprovado");
        }else if (nota >= 40) {
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do Programa");
 //--------------------------------------------------------------------------------------------------------

        //Condção com os Switch
        int pos = 8;


        switch (pos) {
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
                case 4: case 5: case 6:
                System.out.println("Premio de participação");
                break;
            default:
                System.out.println("Ultimo lugar, nao Ganho premio");
                break;
        }

    }
}
