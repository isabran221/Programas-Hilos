/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author isabr
 */
/**
 * Clase que representa una caja de supermercado.
 * Implementa la interfaz Runnable para permitir que cada instancia se ejecute en un hilo separado.
 */
class CajaSupermercado implements Runnable {
    private String nombreCaja;

    /**
     * Constructor que asigna un nombre a la caja.
     * @param nombreCaja El nombre de la caja.
     */
    public CajaSupermercado(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    /**
     * Método run que se ejecuta cuando el hilo comienza.
     * Simula el procesamiento de clientes.
     */
    @Override
    public void run() {
        System.out.println(nombreCaja + " está procesando...");
        try {
            // Simular el tiempo de procesamiento de cada cliente (entre 0 y 1000 ms)
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombreCaja + " ha terminado de procesar.");
    }
}

/**
 * Clase principal que simula el funcionamiento de un supermercado con múltiples cajas.
 */
public class Supermercado {
    /**
     * Método principal para iniciar la simulación.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear tres hilos, cada uno representando una caja del supermercado
        Thread caja1 = new Thread(new CajaSupermercado("Caja 1"));
        Thread caja2 = new Thread(new CajaSupermercado("Caja 2"));
        Thread caja3 = new Thread(new CajaSupermercado("Caja 3"));

        // Iniciar los hilos
        caja1.start();
        caja2.start();
        caja3.start();

        // Esperar a que todos los hilos terminen su ejecución
        try {
            caja1.join();
            caja2.join();
            caja3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimir un mensaje cuando todas las cajas hayan terminado
        System.out.println("Todas las cajas han terminado de procesar.");
    }
}
