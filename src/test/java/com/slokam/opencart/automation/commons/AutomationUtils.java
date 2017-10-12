package com.slokam.opencart.automation.commons;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AutomationUtils {

	public static  void uploadThroughRobot(String pathName) {

		try {
			Robot robot = new Robot();

			StringSelection stringSelection = new StringSelection(pathName);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);


            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sleep(int secs) {
		try {
			Thread.sleep(1000*secs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AutomationUtils.uploadThroughRobot("D:\\screenshot.jpg");
	}
}
