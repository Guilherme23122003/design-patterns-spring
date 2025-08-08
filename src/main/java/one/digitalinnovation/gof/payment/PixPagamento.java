package one.digitalinnovation.gof.payment;

public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: R$ " + valor);
    }
}