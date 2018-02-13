package pa03;

import java.awt.Color;
import java.util.*; // for random class
import java.awt.Graphics;


public class QiCircle extends CircleShape{

  public double speed;
  public Color color;
  public Color borderColor;

  public QiCircle(){
    super();
    Random rand = new Random();

    this.color = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    if(rand.nextInt(1) == 0){
      this.borderColor = Color.white;
      this.speed = rand.nextInt(10);
    } else {
      this.borderColor = Color.black;
      this.speed = rand.nextInt(0) + 1;
    }
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
      this.vx = this.speed;
      //this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = this.speed;
      //this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = this.speed;
      //this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = this.speed;
      //this.y = CircleShape.boardHeight-this.radius;
    }
    super.keepOnBoard();
  }


  /**
   * Draw the disk in graphics context g, with a black outline.
   * Its posiion is given by doubles so we have to convert them to integers!
   * Remember that the draw/fillOval methods take the upper left corner (u,v)
   * and the width (w) and height (h) of the smallest box enclosing the oval.
   */
  public void draw( Graphics g ) {
      int u = (int)(x-radius);
      int v = (int)(y-radius);
      int w = (int)(2*radius);
      int h = w;
      g.setColor( this.color );
      g.fillOval( u,v,w,h );
      g.setColor( this.borderColor );
      g.drawOval(u,v,w,h );
  }


}
