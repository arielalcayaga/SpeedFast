package util;

import model.Pedido;

import java.util.concurrent.PriorityBlockingQueue;

public class ZonaDeCarga {
    private final PriorityBlockingQueue<Pedido> colaPedidos;

        public ZonaDeCarga(int capacidad) {
            this.colaPedidos = new PriorityBlockingQueue<>(capacidad);
        }

        public synchronized void agregarPedido(Pedido p) {
            colaPedidos.put(p);
        }

        public synchronized Pedido retirarPedido() {
            try {
                Pedido p = colaPedidos.take();
                System.out.println("[ZonaDeCarga] Procesando pedido: " + p);
                return p;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
    }

