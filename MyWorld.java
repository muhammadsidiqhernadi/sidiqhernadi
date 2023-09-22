import greenfoot.*; 

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        addObject(new Plane(), 100, 100);
        addObject(new Plane(), 500, 100);
        addObject(new Plane(), 100, 300);
        addObject(new Plane(), 500, 300);
    }
}
