package sg.edu.nus.iss.jcalc;
// JCalc - Standard and Scientific Calculator
//
// Class: JCalc
//
// main class to start application
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCalc extends javax.swing.JFrame {

    public static void main(String args[]) {
	JFrame frame = new JFrame("JCalc - Standard & Scientific Calculator");

	frame.addWindowListener(new WindowAdapter() {
       		 public void windowClosing(WindowEvent e) {System.exit(0);}
	});

	JCalcMenuBar myMenuBar = new JCalcMenuBar(frame);

	JCalcStandardFrame myFrame = new JCalcStandardFrame();
        JPanel myPane = myFrame.getPane();
	frame.getContentPane().add(myPane, java.awt.BorderLayout.NORTH);

        frame.pack();
	frame.setVisible(true);
   }

}