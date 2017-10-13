package com.slokam.opencart.automation.commons;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutomationUtils {

	public static  void uploadThroughRobot(String pathName) {
		
		//Simulate Keyboard Events
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
		AutomationUtils.uploadThroughAutoIT("");
	}
	
	
	public static void uploadThroughAutoIT(String filePath) {
		File file  = new File("./src/test/resources/jacob-1.14.3-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX auto = new AutoItX();
		String title = "Open";
		auto.winActivate(title);
		auto.controlSend(title, "", "[CLASS:Edit; INSTANCE:1]", filePath);
		auto.controlClick(title, "", "[CLASS:Button; INSTANCE:1]");
	}
	
	
	
}
