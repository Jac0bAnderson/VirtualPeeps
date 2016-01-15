package virt.View;

import virtual.Controller.VirtualController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VirtualPanel extends JPanel
{
private SpringLayout baseLayout;	
private VirtualController baseController;

private JButton startButton;
private JButton exitButton;
private JLabel virtualLogo;

public VirtualPanel(VirtualController baseController)
{
this.baseController = baseController;
baseLayout = new SpringLayout();

startButton = new JButton("Start");
exitButton = new JButton("Exit");


virtualLogo = new JLabel("");


virtualLogo.setIcon(new ImageIcon(VirtualPanel.class.getResource("/virt/View/images/virtualpeoplelogo.png")));



setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
	this.add(virtualLogo);
	this.add(exitButton);
	this.add(startButton);
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, virtualLogo, 38, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, virtualLogo, 112, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, startButton, -23, SpringLayout.NORTH, exitButton);
	baseLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, exitButton);
	baseLayout.putConstraint(SpringLayout.WEST, exitButton, 177, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, exitButton, -10, SpringLayout.SOUTH, this);
}

private void setupListeners()
{
	startButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			
		}
	});
	
	exitButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			System.exit(0);
		}
	});
	
}

}