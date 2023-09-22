import greenfoot.*; 

public class Plane extends Actor
{
    private int speed = 2; // Kecepatan pesawat

    public void act() 
    {
        // Menggerakkan pesawat maju
        move(speed);

        // Memeriksa apakah pesawat mencapai tepi dunia
        if (isAtEdge()) {
            // Memutar pesawat 90 derajat saat mencapai tepi dunia
            turn(45);
        }
    }
}
