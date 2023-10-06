package entities;

public class triangule {

    public Double A;
    public Double B;
    public  Double C;

    public Double P;



    public double area () {
        P = (A + B + C) / 2.0 ;
        return Math.sqrt(P * (P - A) * (P - B) * (P - C));
    }

}
