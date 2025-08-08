package one.digitalinnovation.gof.payment;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Cartão: R$ " + valor);
    }
}