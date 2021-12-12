
package robotics;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;

public class LineFollower {
    
    public LineFollower()
    {
        LegoRobot legoRobot = new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        legoRobot.addPart(ls);
        legoRobot.addPart(g);       
        while (true) {            
            int p =ls.getValue();
            g.forward();          
            if(p<100)                       //Black
                g.forward();
            if(p>300 && p<750)              //Blue
                g.leftArc(0.05);
            if(p>800)                       //Yellow
                g.rightArc(0.05);

        }

    }
    
    
    public static void main(String[] args) {
        new LineFollower();
    }
    static {
        RobotContext.setStartPosition(40, 490);
        RobotContext.useBackground("sprites/road.gif");
    }
}
