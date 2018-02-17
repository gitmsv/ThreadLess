package ua.jvlab.smlnk;

public class Main {

    public static void main(String[] args) {

        Thread th = Thread.currentThread();

        CalculateFactor clOne = new CalculateFactor(10000);
        CalculateFactor clTwo = new CalculateFactor(10000);
        CalculateFactor clThree = new CalculateFactor(10000);

        // создание;
        Thread thOne = new Thread(clOne);
        Thread thTwo = new Thread(clTwo);
        Thread thThree = new Thread(clThree);

        // установка демонов потоков (обязательно до их запуска)
//        thOne.setDaemon(true);
//        thTwo.setDaemon(true);
//        thThree.setDaemon(true);

        // запуск ;
        thOne.start();
        thTwo.start();
        thThree.start();


        // поток main System.out.println(th.getName() + " STOP!!!")
        // ждет исполнение всех потоков thOne...thThree;

//        try {
//            thOne.join();
//            thTwo.join();
//            thThree.join();
//
//        } catch (InterruptedException e) {
//
//        }

        System.out.println(th.getName() + " STOP!!!");
    }
}
