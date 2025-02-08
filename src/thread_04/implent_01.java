package thread_04;

public class implent_01  implements  Runnable{

    @Override
    public void run() {
        // the task that you want to done by thread
         for(int i = 0; i <=20; i++){
             //any logic

             //after thread start this should be work
             System.out.println(" i is the value "+i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
