import java.util.ArrayList;

/**
 * Write a description of class ActivityTracker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActivityTracker {
    private ArrayList<Athlete> athletes;
    private ArrayList<Activity> activities;
    private ArrayList<Equipment> equipmentList;

    public ActivityTracker() {
        athletes = new ArrayList<>();
        activities = new ArrayList<>();
        equipmentList = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete) {
        if (athlete != null) {
            athletes.add(athlete);
        }
    }

    public void addActivity(Activity activity) {
        if (activity != null) {
            activities.add(activity);
        }
    }

    public void addEquipment(Equipment equipment) {
        if (equipment != null) {
            equipmentList.add(equipment);
        }
    }
}