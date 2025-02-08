package thread_04;

public class Using_lambda_06 {
    public static void main(String[] args) {


        Runnable r = () -> {
            System.out.println(" i am lambda Creation of thread");

        };
        Thread t = new Thread(r);
        t.start();
    }
}