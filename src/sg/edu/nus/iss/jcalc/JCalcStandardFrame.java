package sg.edu.nus.iss.jcalc;
// JCalc - Standard and Scientific Calculator
//
// Class: JCalcStandardFrame
//
// Implement frame to display & handle standard operations (1...0, +, -, /, *)
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCalcStandardFrame extends javax.swing.JFrame {

    public JCalcStandardFrame() {

	myJCalcList = new JCalcList();

        /***********************************************/
	/************** Create Button 0 ****************/
        /***********************************************/
        jButton0 = new javax.swing.JButton();
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

	/***********************************************/
	/************** Create Button 1 ****************/
        /***********************************************/
        jButton1 = new javax.swing.JButton();
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

 	/***********************************************/
	/************** Create Button 2 ****************/
        /***********************************************/
        jButton2 = new javax.swing.JButton();
	jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
  	/***********************************************/
	/************** Create Button 3 ****************/
        /***********************************************/
        jButton3 = new javax.swing.JButton();
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
  	/***********************************************/
	/************** Create Button 4 ****************/
        /***********************************************/
        jButton4 = new javax.swing.JButton();
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
  	/***********************************************/
	/************** Create Button 5 ****************/
        /***********************************************/
        jButton5 = new javax.swing.JButton();
	jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
   	/***********************************************/
	/************** Create Button 6 ****************/
        /***********************************************/
        jButton6 = new javax.swing.JButton();
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        /***********************************************/
	/************** Create Button 7 ****************/
        /***********************************************/
        jButton7 = new javax.swing.JButton();
	jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        /***********************************************/
	/************** Create Button 8 ****************/
        /***********************************************/
        jButton8 = new javax.swing.JButton();
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        /***********************************************/
	/************** Create Button 9 ****************/
        /***********************************************/
        jButton9 = new javax.swing.JButton();
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '.' (jButtonDot) ****************/
        /**************************************************************/
        jButtonDot = new javax.swing.JButton();
        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '+' (jButtonPlus) ****************/
        /**************************************************************/
        jButtonPlus = new javax.swing.JButton();
        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '-' (jButtonMinus) ****************/
        /**************************************************************/
        jButtonMinus = new javax.swing.JButton();
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '*' (jButtonMultiply) ****************/
        /**************************************************************/
        jButtonMultiply = new javax.swing.JButton();
        jButtonMultiply.setText("*");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '/' (jButtonDivide) ****************/
        /**************************************************************/
        jButtonDivide = new javax.swing.JButton();
        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        /**************************************************************/
	/************** Create Button '=' (jButtonEqual) ****************/
        /**************************************************************/
        jButtonEqual = new javax.swing.JButton();
        jButtonEqual.setText("=");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });

        /********************************************************************/
	/************** Create Button 'Clear' (jButtonClear) ****************/
        /********************************************************************/
        jButtonClear = new javax.swing.JButton();
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        /********************************************************************/
	/************** Create Button 'Del' (jButtonDel) ****************/
        /********************************************************************/
        jButtonDel = new javax.swing.JButton();
        jButtonDel.setText("Del");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        /******************************************************************/
	/************** Create of result display (JDisplay) ****************/
        /******************************************************************/
        jDisplay = new javax.swing.JLabel();
	jDisplay.setText("0");


	/******************************************************/
	/************ Creation of Panel ***********************/
	/******************************************************/
	mainPane = new javax.swing.JPanel();
	jPanel1 = new javax.swing.JPanel();
	jPanel2 = new javax.swing.JPanel();
	jPanel3 = new javax.swing.JPanel();

	jPanel1.setLayout(new java.awt.BorderLayout());
	jPanel1.add(jDisplay, BorderLayout.NORTH);

	jPanel2.setLayout(new java.awt.BorderLayout());
	jPanel2.add(jButtonClear, BorderLayout.CENTER);
	jPanel2.add(jButtonDel, BorderLayout.WEST);

	jPanel3.setLayout(new java.awt.GridLayout(4, 3));
	jPanel3.add(jButtonPlus);
	jPanel3.add(jButtonMinus);
	jPanel3.add(jButtonMultiply);
	jPanel3.add(jButtonDivide);
	jPanel3.add(jButton0);
	jPanel3.add(jButton1);
	jPanel3.add(jButton2);
	jPanel3.add(jButton3);
	jPanel3.add(jButton4);
	jPanel3.add(jButton5);
	jPanel3.add(jButton6);
	jPanel3.add(jButton7);
	jPanel3.add(jButton8);
	jPanel3.add(jButton9);
	jPanel3.add(jButtonDot);
	jPanel3.add(jButtonEqual);

	mainPane.setLayout(new java.awt.BorderLayout());
	mainPane.add(jPanel1, BorderLayout.NORTH);
	mainPane.add(jPanel2, BorderLayout.CENTER);
	mainPane.add(jPanel3, BorderLayout.SOUTH);
    }

    public javax.swing.JPanel getPane()
    {
	return mainPane;
    }

    private void Display()
    {
	String s = myJCalcList.buffer.toString();

	if (debug) System.out.println("Display:"+s);
	if (s.length() == 0) s = "0";
	jDisplay.setText(s);
    }

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt)
    {
  	myJCalcList.buffer.add0();
	Display();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
  	myJCalcList.buffer.add1();
	Display();
    }

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add2();
	Display();
   }

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add3();
	Display();
   }

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add4();
	Display();
   }

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add5();
	Display();
   }

   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add6();
	Display();
   }

   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add7();
	Display();
   }

   private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add8();
	Display();
   }

   private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)
   {
  	myJCalcList.buffer.add9();
	Display();
   }

   private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.buffer.addDot();
	Display();
   }

   private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.addPlus();
	Display();
   }

   private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.addMinus();
	Display();
   }

   private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.addMultiply();
	Display();
   }

   private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.addDivide();
	Display();
   }

   private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt)
   {
	Double result;
	String s;

	if (myJCalcList.buffer.isANumber())
	{
		myJCalcList.addBufferToList();
		if (debug) { myJCalcList.printList(); }
	        result = myJCalcList.calculate();
        	if (debug) { System.out.println("jButtonEqual. The result is:"+result);	}
		if (result.isInfinite())
		{
			myJCalcList.clear();
			myJCalcList.buffer.clear();
			jDisplay.setText("Error - Division by 0");
		}
		else
		{
		Display();
		}
	}
   }

   private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.clear();
	myJCalcList.buffer.clear();
	Display();
   }

   private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt)
   {
	myJCalcList.buffer.del();
	Display();
   }

   private void exitForm(java.awt.event.WindowEvent evt)
   {
        System.exit(0);
   }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
	JFrame frame = new JFrame("JCalc - Test Class JCalcStandardFrame");

	frame.addWindowListener(new WindowAdapter() {
       		 public void windowClosing(WindowEvent e) {System.exit(0);}
	});

	JCalcStandardFrame myFrame = new JCalcStandardFrame();
        JPanel myPane = myFrame.getPane();
	frame.getContentPane().add(myPane, java.awt.BorderLayout.NORTH);

        frame.pack();
	frame.setVisible(true);
    }

    // Variables declaration - do not modify
    private static JCalcList myJCalcList;
    private static boolean debug = true;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPane;
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
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JLabel jDisplay;
   //  End of variables declaration

}