package virt.View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import virtual.Controller.VirtualController;

public class VirtualCreation 
{
	private SpringLayout creationLayout;

	public VirtualCreation(VirtualController baseController)
	{
	 creationLayout = new SpringLayout();
		
		setupPanelTwo();
		setupLayoutTwo();
		setupListenersTwo();
	}
	
	private void setupPanelTwo()
	{
		this.setLayout(creationLayout);
	}
	

	private void setupLayoutTwo()
	{
		
	}
	
	private void setupListenersTwo()
	{
		
	}
}
