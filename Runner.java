import java.util.*;
import java.awt.*;
import gpdraw.*;
public class Runner
{
    public static Polygon p1 = new Polygon(7, 25);

    public static void main(String[] args){
        //drawFancyShape(p1);
        drawPolygon(p1);
       /*
        String info = p1.allTheInfo(p1);
        System.out.print(info);
        
        */

    }
    public static DrawingTool pencil;
    public static SketchPad canvas;

    private static Color RED = Color.red, BLUE = Color.blue, BLACK = Color.black,
    GRAY = Color.gray, YELLOW = Color.yellow,
    PINK = Color.pink, ORANGE = Color.orange,
    GREEN = Color.green, MAGENTA = Color.magenta,
    WHITE = Color.white; 
    public static Color rainbow(){
        Color x = RED;
        for(int i = 1; i < p1.getNumSides(); i++){
            if(i % 2 == 0){
                x = BLUE;
            }
            if(i % 3 == 0){
                x = GREEN;
            }
            if(i % 5 == 0){
                x = MAGENTA;
            }
        }
        return x;
    }

    public static void drawFancyShape(Polygon p1){ //or square
        canvas = new SketchPad(600, 600);
        pencil = new DrawingTool(canvas);
        double angle = 0;
        int num = 0;
        while(num < p1.getNumSides()){
            angle += p1.Angle1();
            pencil.setDirection(angle);
            pencil.forward(15 * p1.getSideLength());
            pencil.setColor(rainbow());
        }

    }

    public static void drawPolygon(Polygon p1){ 
        canvas = new SketchPad(600, 600);
        pencil = new DrawingTool(canvas);
        double angle = 0;
        int num = 0;
        while(num < p1.getNumSides()){
            pencil.home();
            angle += p1.Angle();
            pencil.setDirection(angle);
            pencil.forward(15 * p1.getSideLength());
            pencil.setColor(MAGENTA);
        }

    }
}
