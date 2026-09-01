/**
 * Clase Hija PedidoComida
 */
package model;

import interfaces.Cancelable;
import interfaces.Despachable;
import interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

public class PedidoComida extends Pedido implements Despachable, Cancelable, Rastreable {
    private List<String> historial = new ArrayList<>();
    /**
     * Atributo propio Clase PedidoComida
     */
    private String platoComida;

    /**
     *
     * @param idPedido         identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param distanciaKm      distancia en kilometros pedido
     * @param platoComida      plato de comida
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

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando Repartidor...");
        System.out.println("Asignado a: José Peréz.");
    }
    /**
     * Sobre escritura metodo interfaz Despachable
     */
    @Override
    public boolean despachar() {
        System.out.println("Pedido Comida despachado.");

        return true;

    }
    /**
     * Sobre escritura metodo interfaz Cancelable
     */
    @Override
    public boolean cancelar() {
        System.out.println("Pedido Comida cancelado.");
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