package pa03;
import java.awt.Color;

public class AlexCircle extends CircleShape {
	private double spdFactor = 10.0;
	public AlexCircle() {
		super();
		this.color = new Color(0,100,255,100);
	}
	
	public static void main(String[] args) {
		AlexCircle a = new AlexCircle();
		System.out.println("My Circle is "+a);
	}
	public String toString() {
		return "AlexCircle: " + super.toString();
	}
	
	/**
	 * I want to make the circles vary in speeds depending on which side it hits, the upper left sides speed it up, the lower right sides slow it down
	 */
	
	  public void keepOnBoard(){
		    if (this.x < this.radius) {
		      this.vx = spdFactor*this.vx;

		    }else if (this.x > CircleShape.boardWidth-this.radius) {
		      this.vx = this.vx/spdFactor;
		   
		    }

		    if (this.y < this.radius){		  
		      this.vy = spdFactor*this.vy;

		    } else if (this.y > CircleShape.boardHeight-this.radius) {
		      this.vy = this.vy/spdFactor;
		     
		    }
		    super.keepOnBoard();
		  }
}
