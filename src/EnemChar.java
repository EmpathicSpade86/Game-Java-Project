public class EnemChar extends  MovingObject {

    double spawnInterval;
    int damage;
    boolean deaddead;

    public EnemChar(int xPos, int yPos, Sprite appearance, int Vx, int Vy, int health, double spawnInterval, int damage, boolean deaddead) {
        super(xPos, yPos, appearance, Vx, Vy, health);
        this.spawnInterval = spawnInterval;
        this.damage = damage;
        this.deaddead = deaddead;
    }

    public double getSpawnInterval() {
        return spawnInterval;
    }

    public void setSpawnInterval(double spawnInterval) {
        this.spawnInterval = spawnInterval;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isDeaddead() {
        return deaddead;
    }

    public void setDeaddead(boolean deaddead) {
        this.deaddead = deaddead;
    }

}
