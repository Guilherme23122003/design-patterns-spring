package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    public void processarPedido(Pedido pedido){
        System.out.println("Processar pedido " + pedido.getId());
    }
}
