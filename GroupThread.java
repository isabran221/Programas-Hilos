/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabr
 */
/**
 * Clase que extiende Thread y se asocia a un ThreadGroup.
 */
public class GroupThread extends Thread {
    /**
     * Constructor que asigna el grupo y el nombre al hilo.
     * @param group El grupo de hilos.
     * @param name El nombre del hilo.
     */
    public GroupThread(ThreadGroup group, String name) {
        super(group, name);
    }

    /**
     * Método run que se ejecuta cuando el hilo comienza.
     * Realiza 10 iteraciones y muestra el nombre del hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + getName() + "\t");
        }
    }

    /**
     * Método estático para listar los hilos activos en el grupo.
     * @param group El grupo de hilos.
     */
    public static void listarHilos(ThreadGroup group) {
        int number;
        Thread[] list;
        number = group.activeCount();
        list = new Thread[number];
        group.enumerate(list);
        System.out.println("\nHilos activos en el grupo = " + number);
        for (int i = 0; i < number; i++) {
            System.out.println("Hilo: " + list[i].getName());
        }
    }
}

