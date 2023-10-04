package org.example;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double xA, xB, xC , yA, yB, yC, p;
        double AreaX, AreaY;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter messures of triangule X");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        p = (xA + xB + xC) / 2.0;
        AreaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        System.out.println("Enter messures of triangule Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        p = (yA + yB + yC) / 2.0;
        AreaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Area Triangule X: %4f%n", AreaX);
        System.out.printf("Area Triangule Y: %4f%n", AreaY);

        if(AreaX > AreaY){
            System.out.println("Larger Area: triangule X");
        }else {
            System.out.println("Larger Area: Triangule Y");
        }



        sc.close();
    }
}