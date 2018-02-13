package pa03;
import java.awt.Color;

public class AlexCircle extends CircleShape {
	
	public AlexCircle() {
		super();
		this.color = new Color(0,0,0);
	}
	
	public static void main(String[] args) {
		AlexCircle a = new AlexCircle();
		System.out.println("My Circle is "+a);
	}
	public String toString() {
		return "AlexCircle: " + super.toString();
	}
}