package gui;
import gui.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard  {
	Dashboard() {
		JFrame window = new JFrame();
		window.setVisible(true);
		
	}
	
	public void close() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
	}
}
