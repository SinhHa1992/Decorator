/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator2;

/**
 *
 * @author phamh
 */
interface I{
    void doIt();
}
class A implements I{
    @Override
    public void doIt() {
        System.out.print("A");
    } 
}

abstract class D implements I{
    private I core;

    public D(I core) {
        this.core = core;
    }
    
    @Override
    public void doIt() {
       core.doIt();
    }
    
}

class X extends D{
    
    public X(I core){
        super(core);
    }
    @Override
    public void doIt() {
        super.doIt();
        doX();
    }
    
    public void doX(){
        System.out.print("X");
    }
}
class Y extends D{
    
    public Y(I core){
        super(core);
    }
    @Override
    public void doIt() {
        super.doIt();
        doY();
    }
    
    public void doY(){
        System.out.print("Y");
    }
}

class Z extends D {
    public Z(I inner) {
        super(inner);
    }

    public void doIt()  {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print('Z');
    }
}

public class After {
     public static void main( String[] args ) {
        I[] array = {new X(new A()), new Y(new X(new A())),
                new Z(new Y(new X(new A())))};
        for (I anArray : array) {
            anArray.doIt();
            System.out.print("  ");
        }
    }
}
