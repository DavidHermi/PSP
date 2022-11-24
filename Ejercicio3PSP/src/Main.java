import java.util.Random;

public class Main extends Thread {

    static int contadorFios = 1;
    int numeroRandom = (int) (Math.random() * (600 - 100)) + 100;

    public Main(int a) {
        super(String.valueOf(a));
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fio1 = new Thread(new Main(contadorFios));
        fio1.start();
    }

    public void run() {
        if (contadorFios < 6) {
            for(int i =0; i<10;i++){
                System.out.println("Son o fio " + getName());
                try {
                    Main.sleep(numeroRandom);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Rematou o fío "+getName());
            contadorFios++;
            Thread fio2 = new Thread(new Main(contadorFios));
            fio2.start();
        }
    }
}