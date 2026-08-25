/**
 * Clase Hija PedidoEncomienda
 */
package model;

public class PedidoEncomienda extends Pedido {
    /**
     * Atributo propio Clase PedidoEncomienda
     */
    private double pesoEncomienda;

    /**
     *
     * @param idPedido         identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param distanciaKm      distancia en kilometros pedido
     * @param pesoEncomienda   peso encomienda
     */
    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm, double pesoEncomienda) {
        super(idPedido, direccionEntrega, distanciaKm);
        this.pesoEncomienda = pesoEncomienda;
    }

    public double getPesoEncomienda() {
        return pesoEncomienda;
    }

    public void setPesoEncomienda(double pesoEncomienda) {
        this.pesoEncomienda = pesoEncomienda;
    }

    /**
     * Sobre escritura metodo abstracto calcularTiempoEntrega
     */
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Calculando tiempo entrega...");
       double tiempoEntrega = 20 + 1.5 * distanciaKm;
       int tiempoEntregaEntero = (int) Math.round(tiempoEntrega);
        System.out.println(tiempoEntregaEntero + " minutos aproximadamente.");
        System.out.println("Este tiempo puede variar por " +
                "el peso de la encomienda.");
        System.out.println("Tu encomienda ha salido a repartir.");
    }
}
