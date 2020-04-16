public class StaticObj extends  GameObject {
    boolean solid;
    boolean destructible;
    int integrity;

    public StaticObj(int xPos, int yPos, Sprite appearance, boolean solid, boolean destructible, int integrity) {
        super(xPos, yPos, appearance);
        this.solid = solid;
        this.destructible = destructible;
        this.integrity = integrity;
    }

    public StaticObj(int xPos, int yPos, boolean solid, boolean destructible, int integrity) {
        super(xPos, yPos);
        this.solid = solid;
        this.destructible = destructible;
        this.integrity = integrity;
    }

    public StaticObj(int xPos, int yPos, Sprite appearance) {
        super(xPos, yPos, appearance);
    }

    public boolean isDestructible() {
        return destructible;
    }

    public void setDestructible(boolean destructible) {
        this.destructible = destructible;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }
}
