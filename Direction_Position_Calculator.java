
public class Direction_Position_Calculator {

    private int x, y, z;
    private String direction;
    private String prev_direction_before_upordown = null;

    public Direction_Position_Calculator(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            case "Up":
                z++;
                break;
            case "Down":
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
            case "Up":
                z--;
                break;
            case "Down":
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
            case "Up":
                direction = "Up";
                break;
            case "Down":
                direction = "Down";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
            case "Up":
                direction = "Up";
                break;
            case "Down":
                direction = "Down";
                break;
        }
    }

    public void turnUp() {
    	if(direction!="Up")
    		prev_direction_before_upordown = direction;
        direction = "Up";
    }

    public void turnDown() {
    	if(direction!="Down")
    		prev_direction_before_upordown = direction;
        direction = "Down";
    }

    public void processCommands(String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    if (prev_direction_before_upordown!= null) {
                        direction = prev_direction_before_upordown;
                        turnLeft();
                        prev_direction_before_upordown = null;
                    } else {
                        turnLeft();
                    }
                    break;
                case "r":
                    if (prev_direction_before_upordown!= null) {
                        direction = prev_direction_before_upordown;
                        turnRight();
                        prev_direction_before_upordown = null;
                    } else {
                        turnRight();
                    }
                    break;
                case "u":
                    turnUp();
                    break;
                case "d":
                    turnDown();
                    break;
            }
        }
    }


    public String getFinalPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public String getFinalDirection() {
        return direction;
    }


}
