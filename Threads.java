class A extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("under A");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("under B");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        obj.start();
        obj2.start();
        // object 2
    }
}
