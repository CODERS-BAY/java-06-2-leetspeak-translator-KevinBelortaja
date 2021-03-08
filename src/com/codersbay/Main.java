package com.codersbay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Bitte einen beliebigen Text eingeben:");

    String text = scan.nextLine();

    char[] chars = text.toCharArray();


        for (char c: chars) {

            if (c  == 'a' || c  == 'A') {
                System.out.print("@");
            }
            else if (c  == 'b' || c  == 'B') {
                System.out.print("");
            }
            else if (c  == 'c' || c  == 'C') {
                System.out.print("(");
            }
            else if (c  == 'e' || c  == 'E') {
                System.out.print("3");
            }
            else if (c  == 'g' || c  == 'G') {
                System.out.print("6");
            }
            else if (c  == 'h' || c  == 'H') {
                System.out.print("#");
            }
            else if (c  == 'i' || c  == 'I') {
                System.out.print("!");
            }
            else if (c  == 'l' || c  == 'L') {
                System.out.print("1");
            }
            else if (c  == 'o' || c  == 'O') {
                System.out.print("0");
            }
            else if (c  == 's' || c  == 'S') {
                System.out.print("$");
            }
            else if (c  == 't' || c  == 'T') {
                System.out.print("7");
            }
            else if (c  == 'z' || c  == 'Z') {
                System.out.print("2");
            }

            else {
                System.out.print(c);
            }
        }


    }

}
