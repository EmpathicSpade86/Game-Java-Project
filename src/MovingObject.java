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

    public void MoveTowards(MovingObject me, MovingObject character) {
        if (character.getVx() > me.getVx()) {
            me.setVx(me.getVx() + 10);
        } else {
            me.setVx(me.getVx() - 10);
        }
        if (character.getVy() > me.getVy()) {
            me.setVx((me.getVy() + 10));
        } else {
            me.setVy(me.getVy() - 10);
        }

        if (character.getVx() == me.getVx() && character.getVy() == me.getVy()){
            me.setVx(me.getVx()+1);
            me.setVy(me.getVy()+1);
        }
    }
}
