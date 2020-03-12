import static java.awt.event.KeyEvent.*;

public class MovingObject extends GameObject {
    int Vx;
    int Vy;
    public MovingObject(int xPos, int yPos, Sprite appearance, int xVelocity, int yVelocity) {
        super(xPos, yPos, appearance);
        Vx = xVelocity;
        Vy = yVelocity;
    }

    public static void isKeyPressed(int key){

    }
}
