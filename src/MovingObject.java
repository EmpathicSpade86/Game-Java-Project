import static java.awt.event.KeyEvent.*;

public class MovingObject extends GameObject {
    int Vx;
    int Vy;
    public MovingObject(int xPos, int yPos, Sprite appearance, int xVelocity, int yVelocity) {
        super(xPos, yPos, appearance);
        Vx = xVelocity;
        Vy = yVelocity;
    }

    public int getVx() {
        return Vx;
    }

    public void setVx(int vx) {
        Vx = vx;
    }

    public int getVy() {
        return Vy;
    }

    public void setVy(int vy) {
        Vy = vy;
    }

    public static void isKeyPressed(int key){

    }
}
