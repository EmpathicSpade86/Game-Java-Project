import static java.awt.event.KeyEvent.*;

public class MovingObject extends GameObject {
    int Vx;
    int Vy;
    int health;

    public MovingObject(int xPos, int yPos, Sprite appearance, int Vx, int Vy, int health) {
        super(xPos, yPos, appearance);
        this.Vx = xPos;
        this.Vy = yPos;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
}
