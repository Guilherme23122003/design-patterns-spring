package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Pedido;
import one.digitalinnovation.gof.payment.PagamentoStrategy;
import org.springframework.stereotype.Component;

@Component
public class PedidoFacade {

    private final PedidoService pedidoService;

    public PedidoFacade(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void fazerPedido(Long id, double valor, PagamentoStrategy pagamento) {
        Pedido pedido = new Pedido(id, valor);

        LogService.getInstance().log("Iniciando pedido ID: " + id);

        pedidoService.processarPedido(pedido);
        pagamento.pagar(valor);

        LogService.getInstance().log("Pedido ID: " + id + " finalizado.");
    }
}
