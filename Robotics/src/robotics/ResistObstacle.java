package robotics;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.TouchSensor;

public class ResistObstacle {
    
    public ResistObstacle()
    {
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        TouchSensor ts1=new TouchSensor(SensorPort.S1);
        TouchSensor ts2=new TouchSensor(SensorPort.S2);
        r.addPart(ts2);
        r.addPart(ts1);
        r.addPart(g);
        boolean s1,s2;
        g.forward();
        while(true)
        {
            s1=ts1.isPressed();
            s2=ts2.isPressed();
            if(s1 && s2)
            {
                g.backward(100);
                g.left(400);
                g.forward();
            }
            if(s1)
            {
                g.backward(100);
                g.left(400);
                g.forward();
            }
            if(s2)
            {
                g.backward(100);
                g.right(400);
                g.forward();
            }
        }
    }
    
    public static void main(String[] args) {
        new ResistObstacle();
    }
    
    static {
        RobotContext.setLocation(10,10);
        RobotContext.setStartPosition(10,250);
        RobotContext.useObstacle(RobotContext.channel);
    }
}
