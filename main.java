public class main {

    public static void main(String[] args){

        ContaBancaria conta = new ContaBancaria();

        //Definir os valores da conta
        conta.titular = "Davi Guilherme";
        conta.setNumeroConta(995396);
        conta.setSaldo(1500.0);

        //exibir saldo
        System.out.println("Titular: " + conta.titular);
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo Inicial : R$ " + conta.getSaldo());

        //alterando saldo
        conta.setSaldo(1500.0);
        System.out.println("Saldo atualizado: R$" + conta.getSaldo());
    }
}
