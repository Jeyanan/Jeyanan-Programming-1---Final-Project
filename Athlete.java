import java.util.ArrayList;

/**
 * Write a description of class Athlete here.
 *
 * @author (Jeyanan)
 * @version (May 11)
 */

public class Athlete 
{
    private String name;
    private Gender gender;
    private ArrayList<Activity> activities;
    private String id;
    
    public Athlete(String name, Gender gender) 
    {
        if (id == null || id.isEmpty()) 
        {
             throw new IllegalArgumentException("ID is required.");
        } 
         
        if (name == null || name.isEmpty()) 
        {
             throw new IllegalArgumentException("Name is required.");
        }
         
        if (gender == null)
        { 
             throw new IllegalArgumentException("Gender is required.");
        }
        
        this.name = name;
        this.gender = gender;
        activities = new ArrayList<>();
    }
    
    public void addActivity(Activity activity) 
    {
        activities.add(activity);
    }

    public void listActivities() 
    {
        for (Activity a : activities) 
        {
            System.out.println(a);
        }
    }
    
    public String getId() 
    {
        return id;
    }
    
    public Athlete(String id, String name, Gender gender) 
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}