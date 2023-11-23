public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Mundo");
        String[] vetor = new String[] { "java", "html", "javascript" };

           //Nome de Usuario:Protagonista
           //Senha: 28292425
           //nome do banco de dados plugável: orclpdb

        String java = new String("java");

        String html = new String("HTML");

        String javascript = new String("Java");

       

        System.out.print(vetor[0]==java);

        System.out.print(" "+ vetor[1].equalsIgnoreCase(html) + " ");

        System.out.print(vetor[2].startsWith(javascript));
    }
}
