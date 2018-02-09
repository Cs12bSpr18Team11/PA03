package pa03;

import java.awt.Color;
import java.awt.Graphics;

public class WuCircle extends CircleShape{
  private int  a=255;
  public WuCircle(){
    super();
    this.color = new Color(0,255,255,100);
  }

  public static void main(String[] args){
    WuCircle x = new WuCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "WuCircle:" + super.toString();
  }

  public void keepOnBoard(){
	    if (this.x < this.radius) {
	    	 this.color = new Color(a,0,0);
	    }else if (this.x > CircleShape.boardWidth-this.radius) {
	    	 this.color = new Color(0,a,0);
	    }

	    if (this.y < this.radius){
	    	 this.color = new Color(0,0,a);

	    } else if (this.y > CircleShape.boardHeight-this.radius) {
	    	 this.color = new Color(0,0,0);
	    }
	    super.keepOnBoard();
	  }


}
