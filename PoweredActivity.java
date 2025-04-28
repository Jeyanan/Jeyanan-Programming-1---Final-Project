
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity
 {
    private Equipment equipment;

    public PoweredActivity(String date, double distance, ModeOfTransport mode, Equipment equipment) 
    {
        super(date, distance, mode);
        this.equipment = equipment;
    }
}