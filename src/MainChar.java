import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_RIGHT;

public class MainChar extends MovingObject {

    int ammoCount;
    boolean gunAcquired;

    public MainChar(int xPos, int yPos, Sprite appearance, int Vx, int Vy, int health, int ammoCount, boolean gunAcquired) {
        super(xPos, yPos, appearance, Vx, Vy, health);
        this.ammoCount = ammoCount;
        this.gunAcquired = gunAcquired;
    }
}
