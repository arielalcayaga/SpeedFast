package app;

import model.*;

public class Main {
    public static void main(String[] args) {

Pedido pedidoComida1 = new PedidoComida("001","Los Olmos 1234",
        5.3, "Porotos");
        Pedido pedidoEncomienda2 = new PedidoEncomienda("002","Las Araucarias 5678",
                7.8, 2.5);
        Pedido pedidoExpress3 = new PedidoExpress("003","Las Galaxias 3856",
                10.6, "Normal");

        pedidoComida1.mostrarResumen();
        System.out.println("                                                                  ");
        pedidoComida1.calcularTiempoEntrega();
        System.out.println("==================================================================");


        pedidoEncomienda2.mostrarResumen();
        System.out.println("                                                                  ");
        pedidoEncomienda2.calcularTiempoEntrega();
        System.out.println("==================================================================");


        pedidoExpress3.mostrarResumen();
        System.out.println("                                                                   ");
        pedidoExpress3.calcularTiempoEntrega();
        System.out.println("===================================================================");


    }
}