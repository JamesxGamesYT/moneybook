package gui;
import gui.*;
import javax.swing.*;
import java.awt.GraphicsConfiguration;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


public class Dashboard  {
	Dashboard() {
		GraphicsConfiguration gc;
		JFrame window = new JFrame();
		JLabel title = new JLabel();
		title.setText("m " + "neybook");
		title.setBounds(400,200,100,100);
		JMenuBar sidebar = new JMenuBar();
		sidebar.setSize(256, 1080);
		sidebar.setBackground(Color.BLACK);
		
		
		window.add(sidebar);
		window.add(title);
		
		window.setSize(1920,1080);
		window.setBackground(Color.WHITE);
		window.setTitle("moneybook");
		window.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(1);
	}
	
	public void close() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
	}
}
