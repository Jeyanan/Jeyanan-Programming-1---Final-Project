
/**
 * Write a description of class MainApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainApp {
    public static void main(String[] args) {
        ActivityTracker tracker = new ActivityTracker();

        // Create athletes
        Athlete athlete1 = new Athlete("A001", "Ali", Gender.MALE);
        Athlete athlete2 = new Athlete("A002", "Sara", Gender.FEMALE);
        tracker.addAthlete(athlete1);
        tracker.addAthlete(athlete2);

        // Create equipment
        Equipment bike = new Equipment("Bike", "Trek");

        // Create activities
        Activity a1 = new Activity(1, "2025-05-01", 5.0, ModeOfTransport.RUN, athlete1);
        Activity a2 = new Activity(2, "2025-05-03", 3.2, ModeOfTransport.WALK, athlete2);
        PoweredActivity a3 = new PoweredActivity("2025-05-05", 12.5, ModeOfTransport.BIKE, bike);

        // Add activities
        tracker.addActivity(a1);
        tracker.addActivity(a2);
        tracker.addActivity(a3);

        // Display everything
        System.out.println("\n--- All Athletes ---");
        tracker.listAllAthletes();

        System.out.println("\n--- All Activities ---");
        tracker.listAllActivities();

        System.out.println("\n--- Activities by Athlete A001 ---");
        tracker.listActivitiesByAthlete("A001");

        System.out.println("\n--- Activities by Mode: WALKING ---");
        tracker.listActivitiesByMode(ModeOfTransport.WALK);

        System.out.println("\n--- Total Distance ---");
        System.out.println(tracker.getTotalDistance() + " km");

        System.out.println("\n--- Distance by Athlete A002 ---");
        System.out.println(tracker.getDistanceByAthlete("A002") + " km");

        System.out.println("\n--- Calories by Athlete A001 ---");
        System.out.println(tracker.getCaloriesByAthlete("A001") + " cal");

        System.out.println("\n--- Activity Details (ID 2) ---");
        tracker.printActivityDetails(2);
    }
}