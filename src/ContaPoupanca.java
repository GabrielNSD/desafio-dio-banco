public class ContaPoupanca extends Conta{

    private static double TAXA = 0.05;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void projetarRendimentos(int meses){
        double resultado = super.saldo*Math.pow((1+TAXA), meses);
        System.out.println(String.format("Saldo após %d meses: %.2f", meses, resultado));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupança === ");
        imprimirInfosComuns();
    }

}
