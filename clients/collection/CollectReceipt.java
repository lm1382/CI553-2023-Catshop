package clients.collection;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.RootPaneContainer;
import javax.swing.SwingConstants;

import catalogue.Product;
import clients.PosOnScrn;
import clients.customer.CustomerView;
import middle.MiddleFactory;
import middle.OrderProcessing;

/*
public class CollectReceipt {
	JFrame ReceiptFrame;
	
	public static void main(String[] args) {
		new CollectReceipt();
	}
	
	public static void startReceipt(RootPaneContainer rpc, MiddleFactory mf, int x, int y) {

    	Container cp = rpc.getContentPane();
        Container rootWindow = (Container) rpc;
        cp.setLayout(null);
        
        
        int xSpacing = 40;  // Horizontal spacing
        int ySpacing = 30;  // Vertical spacing

        
        Dimension pos = PosOnScrn.getPos();
        
        int xPos = pos.width;  // Initial X position
        int yPos = pos.height; // Initial Y position
        
        xPos += xSpacing;
        yPos += ySpacing;
        
       

        JFrame window = new JFrame();
        window.setTitle("Recepit");
        

        window.setBounds(xPos, yPos, 400, 300);
        
        window.setVisible(true);

	}

}


public class CollectReceipt {
    JFrame ReceiptFrame;

    public static void main(String[] args) {
        new CollectReceipt();
    }

    public static void startReceipt(RootPaneContainer rpc, MiddleFactory mlf, int x, int y) {
        // Call the logic for starting the Collect window
        startCollectionGUI_MVC(rpc, mlf, x, y);
        
        // Additional logic for the Receipt window (if needed)
        // ...
    }

    private static void startCollectionGUI_MVC(RootPaneContainer rpc, MiddleFactory mlf, int x, int y) {
        Container cp = rpc.getContentPane();
        Container rootWindow = (Container) rpc;
        cp.setLayout(null);

        int xSpacing = 40;  // Horizontal spacing
        int ySpacing = 30;  // Vertical spacing

        int xPos = x;  // Initial X position
        int yPos = y;  // Initial Y position

        xPos += xSpacing;
        yPos += ySpacing;

        JFrame window = new JFrame();
        window.setTitle("Collect Client MVC");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CollectModel model = new CollectModel(mlf);
        CollectView view = new CollectView(window, mlf, xPos, yPos);
        CollectController cont = new CollectController(model, view);
        view.setController(cont);

        model.addObserver(view);       // Add observer to the model
        window.setVisible(true);       // Make window visible
    }
}
*/

public class CollectReceipt {
    JFrame ReceiptFrame;

    public static void main(String[] args) {
        new CollectReceipt();
    }

    public static void startReceipt(RootPaneContainer rpc, MiddleFactory mlf, int x, int y) {
        JFrame window = new JFrame();
        window.setTitle("Receipt");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        window.setLocation(860, 340); //set position on screen for window
       
        window.setSize(400, 300); //set width and height of window
        
        JLabel messageLabel = new JLabel(); //create message 
        messageLabel.setBounds(110, 25, 270, 20);
        messageLabel.setText("Your purchase: "); //set message
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER); //centre the text

        window.add(messageLabel); //add message to window

        
        window.setVisible(true); //make window visible
        
   
    }

}





/*
 * Font f = new Font("Monospaced",Font.PLAIN,12);  // Font f is

        
        Container cp         = rpc.getContentPane();    // Content Pane
        Container rootWindow = (Container) rpc;         // Root Window
        cp.setLayout(null);                             // No layout manager
        
        final JTextArea   recepitView  = new JTextArea();
        final JTextArea   theOutput  = new JTextArea();
        final JLabel      theAction  = new JLabel();
        final JScrollPane theSP      = new JScrollPane();
        
        theAction.setBounds( 110, 25 , 270, 20 );       // Message area
        theAction.setText( "" );                        // Blank
        cp.add( theAction );                            //  Add to canvas

        theSP.setBounds( 110, 55, 270, 205 );           // Scrolling pane
        theOutput.setText( "" );                        //  Blank
        theOutput.setFont( f );                         //  Uses font  
        cp.add( theSP );                                //  Add to canvas
        theSP.getViewport().add( theOutput );           //  In TextArea
        rootWindow.setVisible( true );                  // Make visible
 */


        
        
        
        


       
