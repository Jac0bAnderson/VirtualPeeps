package virt.View;

import javax.swing.JFrame;
import virtual.Controller.VirtualController;

public class VirtualFrame extends JFrame
{
private VirtualPanel basePanel;
private VirtualController baseController;

public VirtualFrame(VirtualController baseController)
{
	this.baseController = baseController;
	basePanel = new VirtualPanel(baseController);
	setupFrame();
}
private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setSize(500, 500);
	this.setResizable(false);
	this.setTitle("Virtual People");
	this.setVisible(true);
}
	
	
}