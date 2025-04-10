package com.chapter13IOappletsandothertopics.programs;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class AppletViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Viewer");
        SimpleApplet applet = new SimpleApplet(); // Ensure the correct applet class name is used
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        applet.init();  // Initialize the applet
        applet.start(); // Start the applet
    }
}
