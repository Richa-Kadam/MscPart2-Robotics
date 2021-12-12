
package robotics;

import ch.aplu.robotsim.TurtleRobot;

public class MoveWithoutGear {
    
    public MoveWithoutGear()
    {
        TurtleRobot turtleRobot = new TurtleRobot();
        turtleRobot.forward(50);
        turtleRobot.left(45);
        turtleRobot.forward(50);
        turtleRobot.right(90);
        turtleRobot.forward(40);
        turtleRobot.exit();;
        
    }
    
    public static void main(String[] args) {
        new MoveWithoutGear();
    }
}
