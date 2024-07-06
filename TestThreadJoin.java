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
public class TestThreadJoin {
    /**
     * Método principal que inicia los hilos.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear hilos con diferentes tiempos de sueño y dependencias
        Thread t1 = new ThreadJoin("1", 1000, null);
        Thread t2 = new ThreadJoin("2", 4000, t1);
        Thread t3 = new ThreadJoin("3", 600, t2);
        Thread t4 = new ThreadJoin("4", 500, t3);

        // Iniciar los hilos
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
