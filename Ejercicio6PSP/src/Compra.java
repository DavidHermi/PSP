public class Compra extends Thread {

    private Caja caj ;
    private int  din ;


    public Compra(Caja caja, int dinero) {
        din = dinero;
        caj = caja;


    }


    @Override
    public void run(){
        caj.Compra(din);
    }





}
