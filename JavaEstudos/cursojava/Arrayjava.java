package cursojava;
import java.util.Arrays;

public class Arrayjava {
    public static void main(String[] args) {

        final int tam= 10;
        int[] num={9,2,1,8,7,6,4,3,5,0};
        int[] numeros=new int[tam];
        int p= 2;
        int pos= 0;  
           
        Arrays.sort(num); //Ordenar os Elementos dos Arrays
        //Arrays.fill(numeros, 10); //Prencher O nosso Array como o valor indicado que seria (10)
        System.arraycopy(num, 0, numeros, 0, tam); //Faz uma copia de um Array, para outro Array
        //String array= Arrays.equals(num, numeros) ? "Sim" : "Não" ; //Faz acomparação de dois Arrays
        
        //System.out.printf("Arrays são iguais: %s", array);

        pos= Arrays.binarySearch(num, p); 
        System.out.printf("O elemento %d está no Array? %s na posição %d ",p,pos > 0 ? "Sim" : "Não", pos);

        /*for(int i=0;i < num.length;i++){
            System.out.printf("%d - ", num[i]);
        } */
           
    for (int n:numeros) {   
        System.out.printf("\n%d - ", n);
    }
    }
}
