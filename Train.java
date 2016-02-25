import java.awt.*;
import java.util.ArrayList;

public class Train
{
    ArrayList<RailCar> cars;
    int StartX;
    int StartY;
    
    public Train(int x, int y)
    {
         cars = new ArrayList<RailCar>();
         StartX=x;
         StartY=y;
    }
    
    public void addCar(String str, Color color)
    {
        if(str.equals("Locomotive"))
        {
            cars.add(new Locomotive(color, StartX, StartY));
        }
        else if(str.equals("PassengerCar"))
        {
            cars.add(new PassengerCar(color, StartX, StartY));
        }
        else if(str.equals("FreightCar"))
        {
            cars.add(new FreightCar(color, StartX, StartY));
        }
        else if(str.equals("Caboose"))
        {
            cars.add(new Caboose(color, StartX, StartY));
        }
        StartX+=175;
    }
    
    public void showCars(Graphics g)
    {
        for(RailCar car:cars)
        {
            car.drawCar(g);
            
        }
    }
}
