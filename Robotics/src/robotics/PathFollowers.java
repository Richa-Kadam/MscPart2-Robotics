
package robotics;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;

public class PathFollowers {
    
    public PathFollowers()
    {
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S1);
        LightSensor rs = new LightSensor(SensorPort.S2);
        r.addPart(rs);
        r.addPart(ls);
        r.addPart(g);
        while(true)
        {
            int a = ls.getValue();
            int b = rs.getValue();
            if(a<=1000 && b<=1000)
            {
                g.forward();
            }
            if(b==0)
            {
                g.rightArc(0.02);
            }
            if(a==0)
            {
                g.leftArc(0.02);
            }
            
            System.out.println("Sensor Val ls:" +a);
            
            System.out.println("Sensor Val rs:" +b);
        }
            
    }
    public static void main(String[] args) {
        new PathFollowers();
    }
    
    static
    {
        RobotContext.setStartPosition(50, 410);
        RobotContext.useBackground("sprites/path.GIF");
    }
}
