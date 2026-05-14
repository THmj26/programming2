package Exercise1;

public class test {
    public static void main(String[] args) throws InterruptedException {
        linkList n0 = new linkList(1, null);
        threadNode t0 = new threadNode(n0, "n0");

        linkList n1 = new linkList(4, null);
        threadNode t1 = new threadNode(n1, "n1");

        linkList n2 = new linkList(3, null);
        threadNode t2 = new threadNode(n2, "n2");

        linkList n3 = new linkList(2, null);
        threadNode t3 = new threadNode(n3, "n3");

        linkList n4 = new linkList(1, null);
        threadNode t4 = new threadNode(n4, "n4");

        linkList n5 = new linkList(0, null);
        threadNode t5 = new threadNode(n5, "n5");

        n0.insert(n1);
        n0.insert(n2);
        n0.insert(n3);
        n0.insert(n4);
        n0.insert(n5);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//        Thread.sleep(10);

        t0.interrupt();
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        t4.interrupt();
        t5.interrupt();

        t0.join();//让主线程等待调用join的这个线程结束
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        n0.printList();
    }
}