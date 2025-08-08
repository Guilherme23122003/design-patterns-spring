package one.digitalinnovation.gof.payment;

public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Boleto: R$ " + valor);
    }
}