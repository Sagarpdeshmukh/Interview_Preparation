package thread_04;

public class main_04 {
    public static void main(String[] args) {
        ExtendThreadClass_03 e2 = new ExtendThreadClass_03();

        e2.start();

        for(int i =0; i < 10; i++){
            System.out.println("i am main thread work"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
