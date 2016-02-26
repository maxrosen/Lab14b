import java.awt.*;
import java.util.ArrayList;

public class Train
{
    ArrayList<RailCar> cars;
    ArrayList<RailCar> newCars;
    ArrayList<String> carNames;
    ArrayList<Color> colors;
    int StartX;
    int StartY;
    int newX;
    
    public Train(int x, int y)
    {
         cars = new ArrayList<RailCar>();
         carNames = new ArrayList<String>();
         newCars = new ArrayList<RailCar>();
         colors = new ArrayList<Color>();
         StartX=x;
         StartY=y;
         newX=x;
    }
    
    public void addCar(String str, Color color)
    {
        StartX+=175;
        if(str.equals("Locomotive"))
        {
            cars.add(new Locomotive(color, StartX, StartY));
            carNames.add(str);
            colors.add(color);
        }
        else if(str.equals("PassengerCar"))
        {
            cars.add(new PassengerCar(color, StartX, StartY));
            carNames.add(str);
            colors.add(color);
        }
        else if(str.equals("FreightCar"))
        {
            cars.add(new FreightCar(color, StartX, StartY));
            carNames.add(str);
            colors.add(color);
        }
        else if(str.equals("Caboose"))
        {
            cars.add(new Caboose(color, StartX, StartY));
            carNames.add(str);
            colors.add(color);
        }

    }
    
    public void addCar(int place, String str, Color color)
    {
        //StartX=place*175+100;
        if(str.equals("Locomotive"))
        {
            cars.add(place, new Locomotive(color, StartX, StartY));
            carNames.add(place,str);
            colors.add(place,color);
        }
        else if(str.equals("PassengerCar"))
        {
            cars.add(place, new PassengerCar(color, StartX, StartY));
            carNames.add(place,str);
            colors.add(place,color);
        }
        else if(str.equals("FreightCar"))
        {
            cars.add(place, new FreightCar(color, StartX, StartY));
            carNames.add(place,str);
            colors.add(place,color);
        }
        else if(str.equals("Caboose"))
        {
            cars.add(place, new Caboose(color, StartX, StartY));
            carNames.add(place,str);
            colors.add(place,color);
        }
        StartX+=175;
    }
    
    public void showCars(Graphics g)
    {
        int k=0;
        for(String names:carNames)
        {
            if(names.equals("Locomotive"))
            {
                newCars.add(new Locomotive(colors.get(k), newX, StartY));
            }
            else if(names.equals("PassengerCar"))
            {
                newCars.add(new PassengerCar(colors.get(k), newX, StartY));
            }
            else if(names.equals("FreightCar"))
            {
                newCars.add(new FreightCar(colors.get(k), newX, StartY));
            }
            else if(names.equals("Caboose"))
            {
                newCars.add(new Caboose(colors.get(k), newX, StartY));
            }
            k++;
            newX+=175;
        }
        for(RailCar car:newCars)
        {
            car.drawCar(g);
        }
    }
}
