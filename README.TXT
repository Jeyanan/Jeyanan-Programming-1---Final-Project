------------------------------------------------------------------------
# Social Network for Athletes (Final Project - 420-101-W25)

## Description

This is a Java-based fitness tracking prototype built using BlueJ. It allows users to create athletes, record their physical activities (regular or powered using equipment), and calculate stats like total distance and calories burned. The system applies object-oriented programming principles including inheritance, encapsulation, and abstraction.

## Features

- Add athletes and powered equipment
- Record activities by mode (e.g., running, biking)
- Track powered activities with equipment details
- Filter activities by athlete or transport mode
- Calculate total distance and calories burned
- Unit tests for distance and calorie methods
- Javadoc documentation included

## How to Use

1. Open the project in BlueJ.
2. Run `MainApp` to see a sample demo.
3. You can also right-click each class to create objects and call methods manually.
4. Run the test classes (`ActivityTest`, `ActivityTrackerTest`, `AthleteTest`) to verify logic.

## Project Structure

- `Activity.java`: Base class for all activities
- `PoweredActivity.java`: Extends Activity, uses Equipment
- `ActivityTracker.java`: Manages all data and logic
- `Athlete.java`, `Equipment.java`: Core entities
- `MainApp.java`: Runs demo of app features
- `doc/`: Javadoc-generated documentation
- `LICENSE.txt`: MIT License
- `README.md`: Project summary and instructions

## License

This project is licensed under the MIT License - see the LICENSE.txt file for details.

## Author

Jeyanan  
Vanier College — Winter 2025  
Course: Programming 1 (420-101-W25)
