package testDemo;

/**
 * @author tachai on 2022/12/6 11:20 上午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class UnsafeClass  implements Runnable {



    static int i=0;


    public static synchronized void sum(){
        int k=100000;
        while (k>0){
            k--;
            i++;

        }
    }

    @Override
    public   void run() {
       sum();
    }


    public static void main(String[] args) throws InterruptedException {
        UnsafeClass runable = new UnsafeClass();
        UnsafeClass runable2 = new UnsafeClass();
        Thread thread1= new Thread(runable);
        thread1.start();
        Thread thread2 = new Thread(runable2);
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(i);

    }
}
