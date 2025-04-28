
/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity 
{
    protected String date;
    protected double distance;
    protected ModeOfTransport mode;

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
}