import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  int circleX = 30;
  int circleY = 30;
  boolean upPressed = false;
  boolean downPressed = false;
  boolean rightPressed = false;
  boolean leftPressed = false;
  public void settings() {
	// put your size call here
    size(400, 400);
  
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(28,28,28);  
    if (mousePressed) {
      ellipse(mouseX, mouseY, 25, 25);
    }
    if (keyPressed) {
      if (key == 'r') {
        background(247, 19, 19);
      } 
      else if (key == 'g') {
        background(46, 193, 35);
      } 
      else if (key == 'b') {
        background(3, 3, 249);
      }
    } 
    else {
      background(28,28,28);
    }
    if (upPressed) {
      circleY--;
    }
    if (downPressed) {
      circleY++;
    }
    if (leftPressed) {
      circleX--;
    }
    if (rightPressed) {
      circleX++;
    }
    ellipse(circleX,circleY,20,20);
    
  }
  
  // define other methods down here.
  public void mouseDragged(){
    ellipse(mouseX, mouseY, 30, 30);
  }
  public void keyPressed(){
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }      
    }
    public void keyReleased() {
      if (keyCode == UP) {
        upPressed = false;
      }
      else if (keyCode == DOWN) {
        downPressed = false;
      }
      else if (keyCode == LEFT) {
        leftPressed = false;
      }
      else if (keyCode == RIGHT) {
        rightPressed = false;
  }
}
}