package concurrency.printinorder.syncronized;
public class Foo {
    private static volatile int count = 1;

    public Foo() {}

    public void first() throws InterruptedException {
        synchronized (this) {
            System.out.println("first");
            count = 2;
            this.notifyAll();
            Thread.sleep(5000);
        }
    }

    public void second() throws InterruptedException {
        synchronized (this) {
            while (count == 1 || count == 3) {
                System.out.println("SECOND WAITING....");
                this.wait();
            }

            System.out.println("second");
            count = 3;
            this.notifyAll();
        }
    }

    public void third() throws InterruptedException {
        synchronized (this) {
            while (count == 1 || count == 2) {
                System.out.println("THIRD WAITING....");
                this.wait();
            }
            System.out.println("third");
            count = 99;
            this.notifyAll();

        }
    }
}
