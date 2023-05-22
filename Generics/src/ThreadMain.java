public class ThreadMain {
    public static void main(String[] args){
        System.out.println(Thread.activeCount());
        Thread thread1 = new ThreadExample();
        thread1.setName("Thread1");
        thread1.start();

        Thread thread2 = new ThreadExample();
        thread2.setName("Thread2");
        thread2.start();

        Thread thread3 = new Thread(new RunnableExample());
        thread3.start();

        Thread thread4 = new Thread(() -> {
            int i = 1;
            while(i < 30){
                System.out.println(i + " " + Thread.currentThread().getName() );
            }
        });
        thread4.start();

    }
}
