package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.payment.BoletoPagamento;
import one.digitalinnovation.gof.payment.CartaoPagamento;
import one.digitalinnovation.gof.payment.PagamentoStrategy;
import one.digitalinnovation.gof.payment.PixPagamento;
import one.digitalinnovation.gof.service.PedidoFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoFacade pedidoFacade;

    public PedidoController(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }

    public String realizarPedido(@RequestParam Long id,
                                 @RequestParam double valor, @RequestParam String metodo) {
        PagamentoStrategy pagamento;

        switch (metodo.toLowerCase()) {
            case "pix":
                pagamento = new PixPagamento();
                break;
            case "boleto":
                pagamento = new BoletoPagamento();
                break;
            case "cartao":
                pagamento = new CartaoPagamento();
                break;
            default:
                return "Método de pagamento inválido.";
        }

        pedidoFacade.fazerPedido(id, valor, pagamento);
        return "Pedido realizado com sucesso!";
    }
}