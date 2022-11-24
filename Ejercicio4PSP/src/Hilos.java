

public class Hilos extends Thread {

    int contador;
    String texto;
    public Hilos(String nombre)
    {
        super(nombre);
    }

    public void run() {
        // Creamos un switch que dependiendo del nombre del hilo entrara en un caso u en otro, mostrando el resultado al final.
        switch (getName()) {
            case "Hilo 1":
                for (int i = 0; i <= 10; i++) {
                    if (i % 2 == 0) {
                        contador = contador + i;

                    }
                }
                texto = "pares";
                break;
            case "Hilo 2":
                for (int i = 0; i <= 1000; i++) {
                    if (i % 2 != 0) {
                        contador = contador + i;
                    }
                }
                texto = "impares";
                break;
            case "Hilo 3":
                for (int i = 0; i <= 10; i++) {
                    if (String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("3")) {
                        contador = contador + i;
                    }
                }
                texto = " terminados en 2 y en 3";
                break;
        }
        System.out.println("El total de numeros " + texto + " suma: " + contador);

    }

}
