package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int a = 2;
        int b = 2;
        int c = 2;


        if (a<b&&a<c)
            System.out.println("Smail number"+a);

       else if (b<b&&b<c)
            System.out.println("Smail number"+a);
        else   if (c<b&&a>c)
            System.out.println("Smail number"+a);
        else if (a==b || a==c ||c==b && b<a || c<a && a<b ||c<b && a<c || b<c )
            System.out.println("Tow number are equals");

        else if(a==b&&b==c&&a==c){
            System.out.println("All number are equals");


        }
    }
}