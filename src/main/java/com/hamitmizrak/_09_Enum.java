package com.hamitmizrak;

public enum _09_Enum {
PAZAR,PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI
}

class DenemeEnum{
    public static void main(String[] args) {
      String data=  _09_Enum.PAZAR.toString();
      System.out.println(data);
        System.out.println(_09_Enum.PAZAR.name());
        System.out.println(_09_Enum.PAZAR.ordinal());
    }
}
