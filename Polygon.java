import java.util.*;
import java.awt.*;
import gpdraw.*;
public class Polygon
{
    public static int n; // number of sides
    public static double l; //length of sides

    Polygon(int n, int l){
        this.n = n;
        this.l = l;

    }
    
    public int getNumSides(){
        return this.n;
    }
    
    public double getSideLength(){
        return this.l;
    }
    
    public String toString(){
        return "Number of Sides: " + n + " ,Length of Sides: " + l;
    }

    public double Perimeter(){
        double perimeter = this.n * this.l;
        return perimeter;
    }

    public double Area(Polygon n){
        double area = (0.5 * n.Perimeter() * n.Apothem());
        return area;
    }

    public double Apothem(){
        double apothem = (this.l / (2 * Math.atan(180 / this.n)));
        return apothem;
    }

    public double Angle1(){
        double angle = (((n - 2) * 180)/n);
        return angle;
    }
    
    public double Angle(){
        double angle = ((this.n - 2) * Math.PI / (2+this.n))*100;
        return angle;
    }

    public double Round(){
        double rounded = 0;
        return rounded;
    }
    
    /*
    public boolean compareTo(Polygon n){
        double oneArea = this.Area();
        double twoArea =
    }
    */

    String newLine = System.getProperty("line.separator");
    public String allTheInfo(Polygon n){
        return "Number of Sides: " + this.n + newLine +
        "Length of Sides: " + this.l + newLine +
        "Perimeter: " + n.Perimeter() + newLine +
        "Apothem: " + n.Apothem() + newLine +
        "Area: " + n.Area(n) + newLine +
        "Angle: " + n.Angle();
    }
}

