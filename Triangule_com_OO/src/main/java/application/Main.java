package application;

import entities.triangule;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangule X = new triangule();
        triangule Y = new triangule();

        System.out.println("Enter the mesures of triangule X : ");
        X.A = sc.nextDouble();
        X.B = sc.nextDouble();
        X.C = sc.nextDouble();

        Double AreaX = X.areaTriangule();

        System.out.printf(" Triangule X area : %.2f%n", AreaX);
        System.out.println("Enter the mesures of triangule Y : ");
        Y.A = sc.nextDouble();
        Y.B = sc.nextDouble();
        Y.C = sc.nextDouble();

        Double AreaY = Y.areaTriangule();
        System.out.printf(" Triangule Y area : %.2f%n", AreaY);

        if (AreaX > AreaY){
            System.out.println("Triangule X has the higher area");
        } else if (AreaX < AreaY){
            System.out.println("Triangule Y has the higher area");
        }else {
            System.out.println("Triangule X and Triangule Y has equals area");
        }

    }
}