package org.example;

public class MainClass11Arrays {
    public static void main(String[] args) {
        int[] myNum = {5, 10, 15, 20, 25, 30, 40};
        System.out.println(myNum[0]);
        try {
            System.out.println(myNum[7]);
        } catch(Exception e){
            System.out.println("I am handling this exception" + e);
        }
        System.out.println(myNum[4]);
        System.out.println(myNum[5]);
    }

}
