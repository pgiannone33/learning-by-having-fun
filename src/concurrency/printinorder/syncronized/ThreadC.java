package concurrency.printinorder.syncronized;

public class ThreadC implements Runnable {
    private final Foo foo;
    private long millis;

    public ThreadC(Foo foo, long millis) {
        this.foo = foo;
        this.millis = millis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(millis);
            foo.third();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
