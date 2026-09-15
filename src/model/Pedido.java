package model;

public class Pedido implements Comparable<Pedido> {
private int idPedido;
private String direccionEntrega;
private EstadoPedido estado;

    /**
     *
     * @param idPedido id pedido
     * @param direccionEntrega direccion entrega
     * @param estado estado entrega
     */
    public Pedido(int idPedido, String direccionEntrega, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return
                "\nid Pedido: " + idPedido
                + " | Dirección Entrega: " + direccionEntrega
                + " | Estado Pedido: " + estado
                +"\n";
    }
    @Override
    public int compareTo(Pedido otro) {
        return this.estado.compareTo(otro.estado);
    }
    }