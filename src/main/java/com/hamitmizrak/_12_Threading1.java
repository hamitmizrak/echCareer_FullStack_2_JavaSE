package com.hamitmizrak;


// extends
public class _12_Threading1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Başladım");
            for (int i =1 ; i <=10 ; i++) {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.Class");
        _12_Threading1 threadingA=new _12_Threading1();
        _12_Threading1 threadingB=new _12_Threading1();
        _12_Threading1 threadingC=new _12_Threading1();

        System.out.println("ID: "+threadingA.getId());
        System.out.println("NAME: "+threadingA.getName());
        threadingA.setName("Degisti44");
        System.out.println(threadingA.getName());
        System.out.println(threadingA.isAlive());

        threadingA.start();
        threadingA.join();
        threadingB.start();
        threadingC.start();
    }
}

// implements
class _12_Threading2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Başladım");
            for (int i =1 ; i <=10 ; i++) {
                Thread.sleep(1000);
                System.out.print(i+" ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("2.Class");
    }
}


// Anonymous
class _12_Threading3 {
    public static void main(String[] args) {
        System.out.println("3.Class");
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Başladım");
                    for (int i =1 ; i <=10 ; i++) {
                        Thread.sleep(1000);
                        System.out.print(i+" ");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }) ;
    }
}