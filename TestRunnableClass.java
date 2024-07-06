/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabr
 */
/**
 * Clase principal que inicia la ejecución de los hilos.
 */
public class TestRunnableClass {
    /**
     * Método principal que inicia los hilos.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear e iniciar el primer hilo
        new Thread(new RunnableClass(), "Primer hilo").start();
        // Crear e iniciar el segundo hilo
        new Thread(new RunnableClass(), "Segundo hilo").start();
        // Mensaje que indica que el hilo principal ha terminado
        System.out.println("Termina el hilo principal.");
    }
}
