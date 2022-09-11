package concurrency.printinorder.syncronized;

public class ThreadA implements Runnable {
    private final Foo foo;
    private long millis;

    public ThreadA(Foo foo, long millis) {
        this.foo = foo;
        this.millis = millis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(millis);
            foo.first();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
