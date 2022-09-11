package concurrency.printinorder.syncronized;

public class ThreadB implements Runnable {
    private final Foo foo;
    private long millis;

    public ThreadB(Foo foo, long millis) {
        this.foo = foo;
        this.millis = millis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(millis);
            foo.second();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
