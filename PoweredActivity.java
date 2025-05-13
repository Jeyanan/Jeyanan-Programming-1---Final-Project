
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (Jeyanan)
 * @version (May 11)
 */
public class PoweredActivity extends Activity
 {
    private Equipment equipment;

    public PoweredActivity(String date, double distance, ModeOfTransport mode, Equipment equipment) 
    {
        super(date, distance, mode);
        
        if (equipment == null) 
        {
            throw new IllegalArgumentException("Equipment cannot be null for a powered activity.");
        }

        this.equipment = equipment;
    }
}