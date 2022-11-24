public class Main {
    public static void main(String[] args) {



        // Definimos nuestros hilos.
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");

        // lanzamos los hilos.
        hilo1.start();
        hilo2.start();



    }
}