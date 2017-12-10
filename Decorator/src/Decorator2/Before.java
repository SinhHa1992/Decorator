///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Decorator;
//
///**
// *
// * @author phamh
// */
//class A {
//    /**
//     * make A
//     */
//    public void doIt(){
//        System.out.print("A");
//    }
//}
//
//class AwithX extends A{
//    /**
//     * make A -> make X
//     */
//    @Override
//    public void doIt(){
//        super.doIt();
//        doX();
//    }
//    
//    public void doX(){
//        System.out.print("X");
//    }
//}
//
//class AwithY extends A{
//    /**
//     * make A -> make Y
//     */
//    @Override
//    public void doIt(){
//        super.doIt();
//        doY();
//    }
//    public void doY(){
//        System.out.print("Y");
//    }
//}
//
//class AwithZ extends A {
//    /**
//     * make A -> make Z
//     */
//    @Override
//    public void doIt() {
//        super.doIt();
//        doZ();
//    }
//
//    public void doZ() {
//        System.out.print('Z');
//    }
//}
//
//class AwithXY extends AwithX {
//    private AwithY obj = new AwithY();
//    @Override 
//    public void doIt(){
//        super.doIt();
//        obj.doY();
//    }
//}
//class AwithXYZ extends AwithX {
//    private AwithY obj1 = new AwithY();
//    private AwithZ obj2 = new AwithZ();
//
//    public void doIt() {
//        super.doIt();
//        obj1.doY();
//        obj2.doZ();
//    }
//}
//
//
//public class Before {
//    public static void main(String[] args) {
//        A[] array = {new AwithX(), new AwithXY(), new AwithXYZ()};
//        for (A a : array) {
//            a.doIt();
//            System.out.print("  ");
//        }
//    }
//}
