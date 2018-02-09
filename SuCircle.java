package pa03;

import java.awt.Color;

public class SuCircle extends CircleShape{

  private double ab = 5.0;

  public SuCircle(){
    super();
    this.color = new Color(255,0,255,100);
  }

  public static void main(String[] args){
    SuCircle x = new SuCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "SuCircle:" + super.toString();
  }

  /**
	 * make the circles keep on board as usual,
   * but also make the velocity change.
   * If it touches the board,
	 * then its velovity becomes twice as fast
	 */

  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = 2*this.vx + ab;
      //this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = this.vx + ab;
      //this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = 2*this.vy + ab;
      //this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = this.vy + ab;
      //this.y = CircleShape.boardHeight-this.radius;
    }
    super.keepOnBoard();
  }



}
