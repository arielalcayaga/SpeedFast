/**
 * Clase Hija PedidoComida
 */
package model;

public class PedidoComida extends Pedido {
    /**
     * Atributo propio Clase PedidoComida
     */
    private String platoComida;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param distanciaKm distancia en kilometros pedido
     * @param platoComida plato de comida
     */
    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm, String platoComida) {
        super(idPedido, direccionEntrega, distanciaKm);
        this.platoComida = platoComida;
    }

    public String getPlatoComida() {
        return platoComida;
    }

    public void setPlatoComida(String platoComida) {
        this.platoComida = platoComida;
    }

    /**
     * Sobre escritura metodo abstracto calcularTiempoEntrega
     */
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Calculando tiempo entrega...");
        double tiempoEntrega = 15 + 2 * distanciaKm;
        int tiempoEntregaEntero = (int) Math.round(tiempoEntrega);
        System.out.println(tiempoEntregaEntero + " minutos aproximadamente.");
        System.out.println("Este tiempo puede variar por " +
                "el tiempo de cocción de la comida.");
        System.out.println("Tu pedido de comida ha salido a repartir.");
    }
}