
/**
 * Write a description of class Activity here.
 *
 * @author (Jeyanan)
 * @version (May 11)
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
        if (id < 0)
        { 
            throw new IllegalArgumentException("ID cannot be negative.");
        } 
        
        if (distance < 0)
        { 
             throw new IllegalArgumentException("Distance must be non-negative.");
        }
        
        if (date == null || date.isEmpty()) 
        {
             throw new IllegalArgumentException("Date cannot be empty.");
        }
        
        if (mode == null) 
        {
             throw new IllegalArgumentException("Mode is required.");
        }
        
        if (athlete == null)
        {   
            throw new IllegalArgumentException("Athlete cannot be null.");
        }
        
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