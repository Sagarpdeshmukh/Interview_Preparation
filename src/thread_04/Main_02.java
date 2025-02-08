package thread_04;

public class Main_02 {

    public static void main(String[] args) throws InterruptedException {
        implent_01 i1 = new implent_01();
        // we cant start using interface thats why we need Thread class object
        Thread t1 = new Thread(i1);
        t1.start();

        for(int i = 1; i <10; i++){
            System.out.println( " i am main threa"+i);
            Thread.sleep(1000);
        }
    }
}
