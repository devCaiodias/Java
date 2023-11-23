package trabalhandoObjetos.sistemaBancario;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente= new Conta();
        Pessoa fulano = new Pessoa();
        
        fulano.setName("Caio");
        contaCorrente.depositar(100);
        contaCorrente.setAgencia(125);
        contaCorrente.setNumero(240);;
        
        contaCorrente.depositar(1000);
        contaCorrente.retirar(50);
        
        //System.out.println(fulano.getName());
        //System.out.println(contaCorrente.getSaldo());
        
        Conta contaPoupanca= new Conta(111, 252, 200);

        contaPoupanca.depositar(100);
        contaPoupanca.retirar(50);
       // System.out.println(contaPoupanca.getSaldo());

        ContaCorrente corrente = new ContaCorrente();

        corrente.depositar(100);
        corrente.setCheque(50);
        corrente.setAgencia(255);
        corrente.setTipo("Dark");
        corrente.setNumero(694);
        corrente.retirada(10);

        System.out.println(corrente.getSaldo());
        System.out.println(corrente.getTipo());


    }
}
