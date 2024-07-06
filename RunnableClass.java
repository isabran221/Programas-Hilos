/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabr
 */
/**
 * Clase que implementa la interfaz Runnable.
 * Esta realiza una tarea simple en un bucle y muestra mensajes en la consola.
 */
public class RunnableClass implements Runnable {
    /**
     * Método run que se ejecuta cuando el hilo comienza.
     * Realiza 5 iteraciones y muestra el nombre del hilo y el número de iteración correspondiente.
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración " + (i + 1) + " de " + Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
}
