//Rosen and Gupta Choo-Choo Train Lab

import java.awt.*;
import java.util.ArrayList;

public class Train
{
    ArrayList<RailCar> newCars;
    ArrayList<String> carNames;
    ArrayList<Color> colors;
    int StartX;
    int StartY;
    
    public Train(int x, int y)
    {
        //Creates ArrayList to identify cars in the order they are intended to be in 
        carNames = new ArrayList<String>();
        //Creates primary train
        newCars = new ArrayList<RailCar>();
        //Creates ArrayList to identify car colors in the order they are intended to be in
        colors = new ArrayList<Color>();
        StartX=x;
        StartY=y;
    }
    
    public void addCar(String str, Color color)
    {
        //Adds cars' names and color to ArrayList
        carNames.add(str);
        colors.add(color);        
    }
    
    public void addCar(int place, String str, Color color)
    {
        //Adds cars' names and color to ArrayList in intended order
        carNames.add(place,str);
        colors.add(place,color);        
    }
    
    //Makes train with cars in intended order
    public void dupTrain(ArrayList<String> array)
    {
        int k=0;
        for(String names:array)
        {
            if(names.equals("Locomotive"))
            {
                newCars.add(new Locomotive(colors.get(k), StartX, StartY));
            }
            else if(names.equals("PassengerCar"))
            {
                newCars.add(new PassengerCar(colors.get(k), StartX, StartY));
            }
            else if(names.equals("FreightCar"))
            {
                newCars.add(new FreightCar(colors.get(k), StartX, StartY));
            }
            else if(names.equals("Caboose"))
            {
                newCars.add(new Caboose(colors.get(k), StartX, StartY));
            }
            k++;
            StartX+=175;
        }
    }
    
    //Draws train
    public void showCars(Graphics g)
    {
        dupTrain(carNames);
        for(RailCar car:newCars)
        {
            car.drawCar(g);
        }
    }
}
