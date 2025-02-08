package thread_04;

public class ExtendThreadClass_03  extends  Thread{
   public void run() {
       for (int i = 0; i < 10; i++) {
           System.out.println("i am, Artificial  creted Threadwork "+i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

       }
   }}