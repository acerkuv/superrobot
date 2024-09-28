package org.example.simplerobot;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(0, 0);
        robot.move(Step.UP);
        robot.move(Step.RIGHT);
        robot.move(Step.DOWN);
        robot.move(Step.LEFT);
        robot.move(Step.RIGHT);

        out.println(robot.readTrace());


    }
}
