package _04_BoundedTypeParameters;

class Bound<T extends A>{

    private T objRef;

    public Bound(T objRef) {
        this.objRef = objRef;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class A{

    public void displayClass(){
        System.out.println("Inside class A");
    }

}

class B extends A{

    public void displayClass(){
        System.out.println("Inside class B");
    }

}

class C extends A{

    public void displayClass(){
        System.out.println("Inside class C");
    }

}

class D {

    public void displayClass(){
        System.out.println("Inside class C");
    }

}




public class BoundedClass1 {

    public static void main(String[] args) {

        Bound<C> bc = new Bound<>(new C());
        bc.doRunTest();

        Bound<B> bb = new Bound<>(new B());
        bb.doRunTest();

        Bound<A> ba = new Bound<>(new A());
        ba.doRunTest();

    }
}