package one.digitalinnovation.gof.model;

public class Pedido {
    private long id;
    private double valor;

    public Pedido(long id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }
}
