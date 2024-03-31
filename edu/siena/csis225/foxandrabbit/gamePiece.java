package edu.siena.csis225.foxandrabbit;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
// The above is NOT complete, and possibly has extraneous items.  Do not use wildcards.


/**
 * The start of a framework for a generic class that might be used for game pieces
 * 
 * @author Ira Goldstein (framework)
 * @author
 * @verion Spring 2024
 */
 
class gamePiece extends somethingHelpfulThatWeSawInClass {
	public Type type;			// An enumerated type. Each piece has a type of ...
	public Position position;	// The (ring, space ) position of a piece
	public ImageIcon image;		// The optional image that may be displayed instead text
	
	/**
	 * Constructor - With icon
	 * @param type     ...list...
	 * @param position The current position of the gamePiece
	 * @param image    The optional image icon
	 */
	public gamePiece(Type type, Position position, ImageIcon image) {
		super(container);
		
		type = this.type;
		position = this.position;
		image = this.image;	
	}
	
	
	/**
	 * Constructor - Without icon
	 * @param type     ...list...
	 * @param position The current position of the gamePiece
	 * @param image    The optional image icon
	 */
	public gamePiece(Type type, Position position) {
		super(container);
		
		type = this.type;
		position = this.position;
	}
	
	// Going to need some overrides
	@Override
	.....
	
	
	
	/**
	 * Determines if the move is valid
	 * @param 
	 */
	public Boolean validMove(...){
		...
	}
	