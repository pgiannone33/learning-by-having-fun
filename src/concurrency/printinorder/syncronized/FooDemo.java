package concurrency.printinorder.syncronized;

public class FooDemo {

    public static void main(String[] args) {
        var foo = new Foo();
        var threadA = new Thread(new ThreadA(foo, 2500));
        var threadB = new Thread(new ThreadB(foo, 1000));
        var threadC = new Thread(new ThreadC(foo, 3500));

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
