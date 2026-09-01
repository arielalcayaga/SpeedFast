package app;

import model.*;
import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> historial = new ArrayList<>();
Pedido pedidoComida1 = new PedidoComida("001","Los Olmos 1234",
        5.3, "Porotos");
        Pedido pedidoEncomienda2 = new PedidoEncomienda("002","Las Araucarias 5678",
                7.8, 2.5);
        Pedido pedidoExpress3 = new PedidoExpress("003","Las Galaxias 3856",
                10.6, "Normal");

        pedidoComida1.mostrarResumen();
        pedidoComida1.asignarRepartidor("Juan Soto");
        System.out.println("                                                                  ");
        pedidoComida1.calcularTiempoEntrega();
        pedidoComida1.despachar();

        System.out.println("==================================================================");


        pedidoEncomienda2.mostrarResumen();
        pedidoEncomienda2.asignarRepartidor();
        System.out.println("                                                                  ");
        pedidoEncomienda2.calcularTiempoEntrega();
        pedidoEncomienda2.cancelar();
        System.out.println("==================================================================");


        pedidoExpress3.mostrarResumen();
        System.out.println("                                                                   ");
        pedidoExpress3.calcularTiempoEntrega();
        pedidoExpress3.despachar();
        System.out.println("===================================================================");


    }
}