package sg.edu.nus.iss.jcalc;
// JCalc - Standard and Scientific Calculator
//
// Class JCalcMenuBar
//
// Define the menu bar of JCalc application
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCalcMenuBar extends javax.swing.JFrame
			  implements ActionListener {

    JFrame frame;

    JCalcMenuBar(JFrame myFrame) {

	this.frame = myFrame;

	menuBar = new javax.swing.JMenuBar();

	fileMenu = new javax.swing.JMenu();
        	//openMenuItem = new javax.swing.JMenuItem();
	        //saveMenuItem = new javax.swing.JMenuItem();
        	//saveAsMenuItem = new javax.swing.JMenuItem();
	        exitMenuItem = new javax.swing.JMenuItem();
        //editMenu = new javax.swing.JMenu();
        	//cutMenuItem = new javax.swing.JMenuItem();
	        //copyMenuItem = new javax.swing.JMenuItem();
	        //pasteMenuItem = new javax.swing.JMenuItem();
        	//deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
	        contentsMenuItem = new javax.swing.JMenuItem();
		contentsMenuItem.addActionListener(this);
        	aboutMenuItem = new javax.swing.JMenuItem();
		aboutMenuItem.addActionListener(this);

        fileMenu.setText("File");
        //openMenuItem.setText("Open");
        //fileMenu.add(openMenuItem);
        //saveMenuItem.setText("Save");
        //fileMenu.add(saveMenuItem);
        //saveAsMenuItem.setText("Save As ...");
        //fileMenu.add(saveAsMenuItem);
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        //editMenu.setText("Edit");
        //cutMenuItem.setText("Cut");
        //editMenu.add(cutMenuItem);
        //copyMenuItem.setText("Copy");
        //editMenu.add(copyMenuItem);
        //pasteMenuItem.setText("Paste");
        //editMenu.add(pasteMenuItem);
        //deleteMenuItem.setText("Delete");
        //editMenu.add(deleteMenuItem);
        //menuBar.add(editMenu);
        helpMenu.setText("Help");
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

     	frame.setJMenuBar(menuBar);
        //pack();
	//return menuBar;
    }

    public javax.swing.JMenuBar getMenu()
    {
	return menuBar;
    }

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem)(e.getSource());

	String item = source.getText();

	System.out.println("Item:"+item);

	if (item.equals("About"))
	{
		String text = "JCalculator - alpha version 0.1\n"
			    + "\n";

		JOptionPane.showMessageDialog(frame, text);
	}
	if (item.equals("Contents"))
	{
		String text = "This version of JCalculator is a alpha version.\n"
			    + "Although this version is operationnal, there still some minor bugs\n"
			    + "May you face a problem, click on CLEAR button.\n "
			    + "\n"
			    + "To be informed of future version send a mail to rolifr@yahoo.fr with subject SUBSCRIBE JCALC\n";

		JOptionPane.showMessageDialog(frame, text);
	}
    }



    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
	JFrame frame = new JFrame("JCalc - Test of class JCalcMenuBar");

	frame.addWindowListener(new WindowAdapter() {
       		 public void windowClosing(WindowEvent e) {System.exit(0);}
	});

	JCalcMenuBar myMenuBar = new JCalcMenuBar(frame);


        frame.pack();
	frame.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jDisplay1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration

}