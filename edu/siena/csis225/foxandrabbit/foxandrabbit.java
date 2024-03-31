package edu.siena.csis225.foxandrabbit;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// The above is NOT complete and possibly has extraneous items.  Do not use wildcards.

/**
*	foxandrabbit CSIS-225 
*
*	@author Ira Goldstein (Framework)
*   @author
*	@version Spring 2024  
*/

public class foxandrabbit extends somethingHelpfulThatWeSawInClass implements someTypeOfListeners {

    /**
     * Constructor, which simply calls the superclass constructor
     * with an appropriate window label and dimensions.
     */
	public foxandrabbit() {
		
		super("Fox", 700, 700);
	}

	// Going to need some overrides
	@Override
	...
	


	public static void main(String args[]) {
		
		// Need to take command line arguments
		if (args.length == 0) {
			System.err.println("Usage: java ... ");
			System.exit(1);
		}
		else {
			...
		}

        // construct our object and have its run method invoked to
        // set up the GUI once its thread is ready
		javax.swing.SwingUtilities.invokeLater(new foxandrabbit());
	}
}
