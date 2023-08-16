import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Direction_Position_Test {

	@Test
	public void test1() {
		 int startX = 0, startY = 0, startZ = 0;
	        String initialDirection = "N";
	        String[] commands = {"f", "r", "u", "b", "l"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(0, 1, -1)", pos.getFinalPosition());
	        assertEquals("N", pos.getFinalDirection());
	    }
	@Test
	public void test2() {
		 int startX = 1, startY = 0, startZ = -1;
	        String initialDirection = "N";
	        String[] commands = {"f", "r", "u", "b", "l"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(1, 1, -2)", pos.getFinalPosition());
	        assertEquals("N", pos.getFinalDirection());
	    }

	@Test
	public void test3() {
		 int startX = 0, startY = 0, startZ = 0;
	        String initialDirection = "E";
	        String[] commands = {"r"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(0, 0, 0)", pos.getFinalPosition());
	        assertEquals("S", pos.getFinalDirection());
	    }
	@Test
	public void test4() {
		 int startX = 0, startY = 0, startZ = 0;
	        String initialDirection = "E";
	        String[] commands = {"d","b"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(0, 0, 1)", pos.getFinalPosition());
	        assertEquals("Down", pos.getFinalDirection());
	    }
	@Test
	public void test5() {
		 int startX = 0, startY = 0, startZ = 0;
	        String initialDirection = "E";
	        String[] commands = {"f"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(1, 0, 0)", pos.getFinalPosition());
	        assertEquals("E", pos.getFinalDirection());
	    }
	@Test
	public void test6() {
		 int startX = -1, startY = 1, startZ = 1;
	        String initialDirection = "E";
	        String[] commands = {"f"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);

	        assertEquals("(0, 1, 1)", pos.getFinalPosition());
	        assertEquals("E", pos.getFinalDirection());
	    }
	
	@Test
	public void test7() {
		 int startX = 0, startY = 0, startZ = 0;
	        String initialDirection = "E";
	        String[] commands = {"r","u","b","r"};

	        Direction_Position_Calculator pos = new Direction_Position_Calculator(startX, startY, startZ, initialDirection);
	        pos.processCommands(commands);
	        
	        assertEquals("(0, 0, -1)", pos.getFinalPosition());
	        assertEquals("W", pos.getFinalDirection());
	    }
	}




