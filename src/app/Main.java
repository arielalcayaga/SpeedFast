package app;

import model.EstadoPedido;
import model.Pedido;
import model.Repartidor;
import util.ZonaDeCarga;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //Pedidos
        Pedido pedido1 = new Pedido (1, "Los Alerces 1234", EstadoPedido.PENDIENTE);
        Pedido pedido2 = new Pedido (2, "Los Pinos 5678", EstadoPedido.PENDIENTE);
        Pedido pedido3 = new Pedido (3, "Los Aromos 7575", EstadoPedido.PENDIENTE);
        Pedido pedido4 = new Pedido (4, "Reyes 7657", EstadoPedido.PENDIENTE);
        Pedido pedido5 = new Pedido (5, "Alameda 5647", EstadoPedido.PENDIENTE);


        // Zona de Carga
        ZonaDeCarga zonaDeCarga = new ZonaDeCarga(5);
        zonaDeCarga.agregarPedido(pedido1);
        zonaDeCarga.agregarPedido(pedido2);
        zonaDeCarga.agregarPedido(pedido3);
        zonaDeCarga.agregarPedido(pedido4);
        zonaDeCarga.agregarPedido(pedido5);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Repartidores
        executor.execute(new Repartidor("Javier", zonaDeCarga));
        executor.execute(new Repartidor("Gustavo", zonaDeCarga));
        executor.execute(new Repartidor("Mariana", zonaDeCarga));


        // Simulación durante 10 segundos
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Apagar el sistema
        executor.shutdownNow();

        try {
            if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
                System.out.println("[Main] Algunos hilos no finalizaron correctamente.");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        System.out.println();
        System.out.println("Todos los pedidos han sido entregados correctamente.");
    }
}