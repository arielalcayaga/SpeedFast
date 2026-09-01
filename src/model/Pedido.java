/**
 * Clase Padre abstracta Pedido
 */
package model;

import interfaces.Cancelable;
import interfaces.Despachable;
import interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {
    private List<String> entregas = new ArrayList<>();
    private List<String> canceladas = new ArrayList<>();
    /**
     * Atributos clase Pedido
     */
    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    /**
     *
     * @param idPedido identificador pedido
     * @param direccionEntrega direccion entrega pedido
     * @param distanciaKm distancia kilometros
     */
    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    /**
     * Metodo comun mostrarResumen
     */
     public void mostrarResumen() {
         System.out.println("Tipo pedido: " +getClass().getSimpleName());
         System.out.println("ID Pedido: " +idPedido);
         System.out.println("Dirección Entrega: " +direccionEntrega);
         System.out.println("Distancia en Km: " +distanciaKm);
     }

    /**
     * Metodo abstracto calcularTiempoEntrega
     */
    public abstract void calcularTiempoEntrega();


/**
 * Metodo asignarRepartidor básico
 */
public void asignarRepartidor() {
    System.out.println("Asignando repartidor...");
}
/**
 * Metodo asignarRepartidor con parametro nombreRepartidor
 */
public void asignarRepartidor(String nombreRepartidor) {
    System.out.println("Asignando repartidor...");
    System.out.println("Nombre Repartidor: " + nombreRepartidor);
}
}

