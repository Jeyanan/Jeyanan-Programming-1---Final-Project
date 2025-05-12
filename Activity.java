
/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity 
{
    private int id;
    private String date;
    private double distance;
    private ModeOfTransport mode;
    private Athlete athlete;
    

    public Activity(int id, String date, double distance, ModeOfTransport mode, Athlete athlete) 
    {
        this.id = id;
        this.date = date;
        this.distance = distance;
        this.mode = mode;
        this.athlete = athlete;
    }
    
    public Activity(String date, double distance, ModeOfTransport mode) 
    {
        this.date = date;
        this.distance = distance;
        this.mode = mode;
    }
    
    public void printDetails() 
    {
        System.out.println(date + " " + distance + "km " + mode);
    }
    
    public Athlete getAthlete()
    {
        return athlete;
    }
    
    public ModeOfTransport getModeOfTransport() 
    {
        return mode;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public double getDistance() 
    {
        return distance;
    }
    
}