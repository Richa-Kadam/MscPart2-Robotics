package robotics;

import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Tools;

public class MoveWithMotor {
    
    public MoveWithMotor()
    {
        NxtRobot robot = new NxtRobot();
        Motor m1=  new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        robot.addPart(m2);
        robot.addPart(m1);
        m1.setSpeed(100);
        m2.setSpeed(100);
        m1.forward();
        m2.forward();
        Tools.delay(2000);
        m1.stop();
        Tools.delay(2000);
        m1.forward();
        Tools.delay(2000);
        m2.stop();
        Tools.delay(2000);
        m2.forward();
        Tools.delay(2000);
        robot.exit();
    }
    
    
    public static void main(String[] args) {
        new MoveWithMotor();
    }
}
