package com.hamitmizrak;

import java.util.Scanner;

public class _04_Scanner {

    public static void main(String[] args) {
       // + - * / % ! && ||
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        String adi=klavye.nextLine();
        System.out.println(adi);
    }
}
