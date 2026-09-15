package model;
import util.ZonaDeCarga;

public class Repartidor implements Runnable {
    private final String nombre;
    private final ZonaDeCarga zonaDeCarga;

    /**
     *
     * @param nombre nombre repartidor
     * @param zonaDeCarga implementa una zona de carga para los pedidos
     */
    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Pedido pedido = zonaDeCarga.retirarPedido();
                Thread.sleep(1000); // simula tiempo entre retiro pedido y salida a reparto.
                pedido.setEstado(EstadoPedido.EN_REPARTO);
                System.out.println("[Repartidor: " +nombre+"] Saliendo pedido a reparto : " + pedido);
                Thread.sleep(2000); // simula tiempo de reparto.
                pedido.setEstado(EstadoPedido.ENTREGADO);
                System.out.println("[Repartidor: " +nombre+"] Pedido entregado: " + pedido);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("[Repartidor: " +nombre+"] Interrumpido. Repartidor no hace más repartos.");
            }
        }
    }
}