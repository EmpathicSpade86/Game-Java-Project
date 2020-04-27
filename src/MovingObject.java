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
            me.setVx(me.getVx() + 1);
            System.out.println("Condition 1 Met");
        } else {
            me.setVx(me.getVx() - 1);
            System.out.println("Condition 2 Met");
        }
        if (character.getVy() > me.getVy()) {
            me.setVy((me.getVy() + 1));
            System.out.println("Condition 3 Met");
        } else {
            me.setVy(me.getVy() - 1);
            System.out.println("Condition 4 Met");
        }
        if (character.getVx() == me.getVx() && character.getVy() == me.getVy()){
            me.setVx(me.getVx()+1);
            me.setVy(me.getVy()+1);
            System.out.println("Condition 5 Met");
        }
    }

    public void RandomMovement(MovingObject Zombie){
        int decider = (int) Math.floor(Math.random() * 1001) +1;
        if (decider >= 1 && decider < 250){
            if (Zombie.getHealth() > 0){
                Zombie.setVx(Zombie.getVx() + 10);
            }
            if (Zombie.getHealth() > 0) {
                Zombie.setVy(Zombie.getVy() + 10);
            }
        }
        if (decider >= 250 && decider < 500){
            if (Zombie.getHealth() > 0){
                Zombie.setVx(Zombie.getVx() + 10);
            }
            if (Zombie.getHealth() > 0){
                Zombie.setVy(Zombie.getVy() - 10);
            }
        }
        if (decider >= 500 && decider < 750) {
            if (Zombie.getHealth() > 0){
                Zombie.setVx(Zombie.getVx() - 10);
            }
            if (Zombie.getHealth() > 0) {
                Zombie.setVy(Zombie.getVy() + 10);
            }
        }
        if (decider >= 750 && decider <= 1000){
            if (Zombie.getHealth() > 0){
                Zombie.setVx(Zombie.getVx() - 10);
            }
            if (Zombie.getHealth() > 0){
                Zombie.setVy(Zombie.getVy() - 10);
            }
        }


        System.out.println(decider);
        System.out.println("Moving Randomly");


    }

    public void MoveChar(Sprite dude, MovingObject tester, int spd){
        if (StdDraw.isKeyPressed(VK_DOWN)){
            dude.setPathExtention("");
            dude.SpriteDown();
            tester.setVy(tester.getVy()-spd);
        }
        if (StdDraw.isKeyPressed(VK_UP)){
            dude.setPathExtention("");
            dude.SpriteUp();
            tester.setVy(tester.getVy()+spd);
        }
        if (StdDraw.isKeyPressed(VK_LEFT)){
            dude.setPathExtention("");
            dude.SpriteLeft();
            tester.setVx(tester.getVx()-spd);
        }
        if (StdDraw.isKeyPressed(VK_RIGHT)){
            dude.setPathExtention("");
            dude.SpriteRight();
            tester.setVx(tester.getVx()+spd);
        }
    }

    public void pauseZombie(){

    }

    public void AreaOfDamage(MovingObject zom, MovingObject tester){
        double distance = Math.sqrt(((tester.getVx()-zom.getVx())*(tester.getVx()-zom.getVx())) + ((tester.getVy()-zom.getVy()) * (tester.getVy()-zom.getVy())));

        if (distance <= 100){
            tester.setHealth(tester.getHealth()-100);
        }

        System.out.println(distance);
    }
}
