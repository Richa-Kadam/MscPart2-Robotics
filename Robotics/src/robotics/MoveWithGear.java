package robotics;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtRobot;


public class MoveWithGear {
    
    public MoveWithGear()
    {
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.setSpeed(100);
        gear.forward();
        gear.left(400);
        gear.forward();
        gear.left(400);
        robot.exit();
    }
    
    
    public static void main(String[] args) {
        new MoveWithGear();
    }
}
