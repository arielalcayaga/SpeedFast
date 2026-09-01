/**
 * Clase Hija PedidoEncomienda
 */
package model;

import interfaces.Cancelable;
import interfaces.Despachable;
import interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

public class PedidoEncomienda extends Pedido implements Despachable, Cancelable, Rastreable {
    private List<String> historial = new ArrayList<>();
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

    /**
     * Sobre escritura metodo asignarRepartidor
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando Repartidor...");
        System.out.println("Asignado a: Lucía Beltrán.");
    }
    /**
     * Sobre escritura metodo interfaz Despachable
     */
    @Override
    public boolean despachar() {
        System.out.println("Pedido Encomienda despachado.");
        historial.add("DESPACHADO: " + "Pedido " +idPedido);
        return true;
    }
    /**
     * Sobre escritura metodo interfaz Cancelable
     */
    @Override
    public boolean cancelar() {
        System.out.println("Pedido Encomienda cancelado.");
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
