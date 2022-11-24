public class Main {
    public static void main(String[] args) {

        // Definimos los 2 hilos.
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");

        // Lanzamos nuestros hilos.
        hilo1.start();
        hilo2.start();




    }
}