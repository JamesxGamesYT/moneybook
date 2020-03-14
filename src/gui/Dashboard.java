package gui;
import gui.*;
import javax.swing.*;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Dashboard  {

	Dashboard() {
		JFrame screen = new JFrame();
		JPanel window = new JPanel();
		JLabel title = new JLabel();

		title.setText("m " + "neybook");
		title.setBounds(400,200,100,100);
		title.setVisible(true);
		window.add(title);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		File xkcd = new File("./bin/gui/xkcd-script.ttf");
		Font xkcdscript;
		try {
			xkcdscript = Font.createFont(0, xkcd);
			ge.registerFont(xkcdscript);
			title.setFont(xkcdscript);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		JMenuBar sidebar = new JMenuBar();
		
		sidebar.setBounds(0, 50, 250, 800);
		sidebar.setBackground(Color.BLACK);
		
		window.setLayout(new FlowLayout());
		window.add(sidebar);
		window.add(title);
		
		screen.add(window);
		screen.setBackground(Color.WHITE);
		screen.setTitle("moneybook");
		screen.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		screen.setDefaultCloseOperation(1);
		screen.setVisible(true);
	}
	
	public void close() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
	}
}
