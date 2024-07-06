/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabr
 */
/**
 * Clase que extiende Thread y utiliza los métodos yield() y join().
 */
public class ThreadJoin extends Thread {
    private String name;
    private int sleepTime;
    private Thread waitsFor;

    /**
     * Constructor que asigna el nombre, tiempo de sueño y el hilo que espera.
     * @param name El nombre del hilo.
     * @param sleepTime El tiempo de sueño del hilo.
     * @param waitsFor El hilo que este hilo debe esperar.
     */
    public ThreadJoin(String name, int sleepTime, Thread waitsFor) {
        this.name = name;
        this.sleepTime = sleepTime;
        this.waitsFor = waitsFor;
    }

    /**
     * Método run que se ejecuta cuando el hilo comienza.
     * Duerme por un tiempo especificado y luego espera al hilo especificado si existe.
     */
    @Override
    public void run() {
        System.out.print("[" + name + " ");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(name + " ? ");
        if (waitsFor != null) {
            try {
                waitsFor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " ]");
    }
}
