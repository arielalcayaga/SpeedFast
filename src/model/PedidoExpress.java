/**
 * Clase Hija PedidoExpress
 */
package model;

import interfaces.Cancelable;
import interfaces.Despachable;
import interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

public class PedidoExpress extends Pedido implements Despachable, Cancelable, Rastreable {

    private List<String> historial = new ArrayList<>();
    /**
     * Atributo propio Clase PedidoExpress
     */
    private String tipoUrgenciaPedido;

    /**
     *
     * @param idPedido           identificador pedido
     * @param direccionEntrega   direccion entrega pedido
     * @param distanciaKm        distancia en kilometros pedido
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
        if (distanciaKm > 5) {
            System.out.println("15 minutos aproximadamente");
        } else {
            System.out.println("10 minutos aproximadamente");
        }
        System.out.println("Este tiempo puede variar por " +
                "la cantidad de pedidos del repartidor");
        System.out.println("Tu pedido Express ha salido a repartir.");
    }

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando Repartidor...");
        System.out.println("Asignando a: Alexis Sánchez.");
    }
    /**
     * Sobre escritura metodo interfaz Despachable
     */
    @Override
    public boolean despachar() {
        System.out.println("Pedido Express despachado.");
        historial.add("DESPACHADO: " + "Pedido " +idPedido);
        return true;

    }
    /**
     * Sobre escritura metodo interfaz Cancelable
     */
    @Override
    public boolean cancelar() {
        System.out.println("Pedido Express cancelado.");
        historial.add("CANCELADO: " + "Pedido " +idPedido);
        return true;

    }
    /**
     * Sobre escritura metodo interfaz Rastreable
     */
    @Override
    public List<String> verHistorial() {
        return new ArrayList<>(historial);
    }
}