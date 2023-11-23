package classe;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 10;
        contaCorrente.saldo = 20.50;
        contaCorrente.cliente.nome = "Fulano";
        contaCorrente.cliente.idade = 48;

        contaPoupanca.numero = 14;
        contaPoupanca.saldo = 60;
        contaPoupanca.cliente.nome = "Beotano";
        contaPoupanca.cliente.idade = 50;

        contaInvestimento.numero = 17;
        contaInvestimento.saldo = 100;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 20;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}
