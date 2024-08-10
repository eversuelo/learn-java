package classes.first.example;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a.method2();

        B b = new B();
        b.method1();
        b.method2();
    }
}

class A {
    void method1() {
        System.out.println("Method 1");
    }

    void method2() {
        System.out.println("Method 2");
    }
}

class B {
    void method1() {
        System.out.println("Method 1");
    }

    void method2() {
        System.out.println("Method 2");
    }
}
