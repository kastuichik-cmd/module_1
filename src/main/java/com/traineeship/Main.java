package com.traineeship;


public class Main {
    public static void main(String[] args) {
       byte b = Byte.MAX_VALUE;
       short s = Short.MAX_VALUE;
       int i = Integer.MAX_VALUE;
       long l = Long.MAX_VALUE;

       float f = Float.MAX_VALUE;
       double d = Double.MAX_VALUE;

       boolean bool = true;
       char ch = 'a';

       String str = "TechCore";

       System.out.println("byte: " + b + ", size: " + Byte.BYTES + " bytes");
       System.out.println("short: " + s + ", size: " + Short.BYTES + " bytes");
       System.out.println("int: " + i + ", size: " + Integer.BYTES + " bytes");
       System.out.println("long: " + l + ", size: " + Long.BYTES + " bytes");

       System.out.println("float: " + f + ", size: " + Float.BYTES + " bytes");
       System.out.println("double: " + d + ", size: " + Double.BYTES + " bytes");

       System.out.println("char: " + ch + ", size: " + Character.BYTES + " bytes");
       System.out.println("boolean: " + bool + ", size: нет фиксированного размера в Java");

       System.out.println(str);
    }
}