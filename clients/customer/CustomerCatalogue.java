package clients.customer;

import javax.swing.*;

import clients.PosOnScrn;
import clients.customer.CustomerView.Name;
import middle.MiddleFactory;



import java.awt.*;


/*
public class CustomerCatalogue {
	
	JFrame catalogueFrame;
	
	public CustomerCatalogue() {
		
	}
	
//}
	public static void main (String[] args, JFrame rpc)
	{
		new CustomerCatalogue();
		JFrame  window = new JFrame();     
	    //window.setTitle( "Catalogue" );
	    //window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  
	    

	    //final int H = 300;       // Height of window pixels
	    //final int W = 400;       // Width  of window pixels
	
 
        window.setSize(400, 300);

	    

	    window.setVisible(true);         // Display Screen
	    

	}
	

	public void startCatalogueGUI(RootPaneContainer rpc, MiddleFactory mf, int x, int y) {
		
		  final int H = 300;       // Height of window pixels
		  final int W = 400;       // Width  of window pixels
		    

		  
		 Container cp         = rpc.getContentPane();    // Content Pane
		 Container rootWindow = (Container) rpc;         // Root Window
		 cp.setLayout(null);                             // No layout manager
		 rootWindow.setSize( W, H );                     // Size of Window
		 rootWindow.setLocation( x, y );

		
		
	   
}
	public static void startCustomerCatalogue() {
		// TODO Auto-generated method stub
		
	}
}



public class CustomerCatalogue {

    public static void main(String[] args) {
        new CustomerCatalogue();
    }
}

public class CustomerCatalogue
{
	


	public void startCatalogue(MiddleFactory mlf)
	{
		new CustomerCatalogue();
	
	}
}
*/

public class CustomerCatalogue {
    JFrame catalogueFrame;

    public static void main(String[] args) {
        new CustomerCatalogue();
        
    }

    public void startCatalogueGUI(RootPaneContainer rpc, MiddleFactory mf, int x, int y) {
 
    	
    	
    	Container cp = rpc.getContentPane();
        Container rootWindow = (Container) rpc;
        cp.setLayout(null);
        
        
        int xSpacing = 60;  // Horizontal spacing
        int ySpacing = 40;  // Vertical spacing

        
        Dimension pos = PosOnScrn.getPos();
        
        int xPos = pos.width;  // Initial X position
        int yPos = pos.height; // Initial Y position
        
        xPos += xSpacing;
        yPos += ySpacing;
        

        JFrame window = new JFrame();
        window.setTitle("Catalogue");

       
        window.setBounds(xPos, yPos, 400, 300);
        
        String column[]= {"CODE", "DESCRIPTION", "PRICE"};
        
        String data [][] = {
        		{"0001", "40' LED HD TV", "£269.00"},
        		{"0002", "DAB RADIO", "£29.99"},
        		{"0003", "TOASTER", "£19. 99"},
        		{"0004", "WATCH", "£29.99"},
        		{"0005", "DIGITAL CAMERA", "£89.99"},
        		{"0006", "MP3 PLAYER", "£7.99"},
        		{"0007", "32Gb USB2 DRIVE", "£6.99"}
        	};		
        
        JTable cata = new JTable(data, column);
        
        Font font = new Font("Verdana", Font.PLAIN, 12);
        cata.setFont(font);
        
        cata.setBounds(0,0,400,300);
        
        int gaps = 35;  // Adjust as needed
        cata.setRowHeight(gaps);
        
        JScrollPane sp = new JScrollPane(cata);
        window.add(sp);
      
        
        
        window.setVisible(true);
    }
}

