public class Main {
    public static void main(String[] args) {

        // Creamos los 3 hilos.
        Hilos hilo1 = new Hilos("Hilo 1");
        Hilos hilo2 = new Hilos("Hilo 2");
        Hilos hilo3 = new Hilos("Hilo 3");

        // Lanzamos nuestros hilos.
        hilo1.start();
        hilo2.start();
        hilo3.start();






    }
}