/**
 * Clase Hija PedidoExpress
 */
package model;

public class PedidoExpress extends Pedido {
    /**
     * Atributo propio Clase PedidoExpress
     */
    private String tipoUrgenciaPedido;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param distanciaKm distancia en kilometros pedido
     * @param tipoUrgenciaPedido tipo urgencia pedido
     */
    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm, String tipoUrgenciaPedido) {
        super(idPedido, direccionEntrega, distanciaKm);
        this.tipoUrgenciaPedido = tipoUrgenciaPedido;
    }

    public String getTipoUrgenciaPedido() {
        return tipoUrgenciaPedido;
    }

    public void setTipoUrgenciaPedido(String tipoUrgenciaPedido) {
        this.tipoUrgenciaPedido = tipoUrgenciaPedido;
    }

    /**
     * Sobre escritura metodo abstracto calcularTiempoEntrega
     */
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Calculando tiempo entrega...");
        if (distanciaKm > 5){
            System.out.println("15 minutos aproximadamente");
        } else {
            System.out.println("10 minutos aproximadamente");
        }
        System.out.println("Este tiempo puede variar por " +
                "la cantidad de pedidos del repartidor");
        System.out.println("Tu pedido Express ha salido a repartir.");
    }
}