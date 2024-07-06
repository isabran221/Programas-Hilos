/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isabr
 */
/**
 * Clase principal que inicia la ejecución de los hilos en un grupo.
 */
public class TestGroupThread {
    /**
     * Método principal que inicia los hilos.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear un grupo de hilos
        ThreadGroup grupo = new ThreadGroup("Grupo de hilos.");
        // Crear una matriz de hilos
        GroupThread[] hilos = new GroupThread[5];

        // Crear los hilos y asociarlos al grupo
        for (int cont = 0; cont < hilos.length; cont++) {
            hilos[cont] = new GroupThread(grupo, "Hilo " + (cont + 1));
        }

        // Iniciar los hilos
        for (int cont = 0; cont < hilos.length; cont++) {
            hilos[cont].start();
        }

        // Listar los hilos activos en el grupo
        GroupThread.listarHilos(grupo);
    }
}
