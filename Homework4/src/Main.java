import sun.awt.image.ImageWatched;

public class Main {

    public static Object obj = new Object();


    public static void main(String[] args) {

        ThreadSafeLinkedList list = new ThreadSafeLinkedList();

        Thread thread1 = new Thread(list);
        Thread thread2 = new Thread(list);


        thread1.start();

        thread2.start();




    }
}
