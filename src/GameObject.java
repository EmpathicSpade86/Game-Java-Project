public class GameObject {
    private int xPos;
    private int yPos;
    Sprite appearance;

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Sprite getAppearance() {
        return appearance;
    }

    public void setAppearance(Sprite appearance) {
        this.appearance = appearance;
    }

    public GameObject(int xPos, int yPos, Sprite appearance) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.appearance = appearance;
    }
}
