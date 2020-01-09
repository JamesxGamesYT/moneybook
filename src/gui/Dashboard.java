package gui;
import gui.*;
import javax.swing.*;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Dashboard  {
	private String customfont;

	Dashboard() {
		customfont = "yes";
		JFrame window = new JFrame();
		JLabel title = new JLabel();
		try {
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			File xkcd = new File("./bin/gui/xkcd-script.ttf");
			System.out.println(xkcd.getCanonicalPath());
			Font xkcdscript = Font.createFont(0, xkcd);
			ge.registerFont(xkcdscript);
			title.setFont(xkcdscript);
		} catch (IOException | FontFormatException e) {
			System.out.println(e);
			customfont = "no";
		}
		title.setText("m " + "neybook");
		title.setBounds(400,200,100,100);
		
		JMenuBar sidebar = new JMenuBar();
		sidebar.setBounds(0, 50, 250, 800);
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
		System.out.println(dashboard.customfont);
	}
}
