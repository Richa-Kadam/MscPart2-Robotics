
package robotics;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.NxtRobot;

public class CircleWithGear {
    
    public CircleWithGear()
    {
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.setSpeed(100);
        for(int i=0;i<=27;i++)
        {
            gear.forward();
            gear.leftArc(0.36,360);
        }
        robot.exit();
   
    }
    
    public static void main(String[] args) {
        new  CircleWithGear();
    }
}
