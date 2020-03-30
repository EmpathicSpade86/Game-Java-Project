import javax.swing.plaf.synth.SynthPopupMenuUI;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.*;

import static java.awt.event.KeyEvent.*;

public class Main {

    public static void main(String[] args) {
        Sprite dude = new Sprite("bob", "mainguy/", 1);
        MovingObject tester = new MovingObject(500,500, dude, 0 , 0, 500);
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0,1000);

        dude.SpriteIdle();
        double positionY= tester.getyPos();
        double positionX= tester.getxPos();

        while(true)
        {

            StdDraw.picture(positionX,positionY,"Sprites/" + dude.getPath() + "(" + dude.getFrame() + ").png");
            dude.animate();
            StdDraw.show();
            StdDraw.clear();
            try {
                Thread.sleep(160,66667);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tester.setHealth(tester.getHealth()-10);
            if (tester.getHealth() <= 0){
                dude.setPathExtention("");
                dude.SpriteDead();
                tester.setHealth(1);
                System.exit(0);
            }
            StdDraw.setPenColor(Color.RED);
            StdDraw.filledRectangle(0,1000,tester.getHealth(),50);

            if (StdDraw.isKeyPressed(VK_DOWN)){
                dude.setPathExtention("");
                dude.SpriteDown();
                positionY = positionY - 10;
            }
            if (StdDraw.isKeyPressed(VK_UP)){
                dude.setPathExtention("");
                dude.SpriteUp();
                positionY = positionY + 10;
            }
            if (StdDraw.isKeyPressed(VK_LEFT)){
                dude.setPathExtention("");
                dude.SpriteLeft();
                positionX = positionX - 10;
            }
            if (StdDraw.isKeyPressed(VK_RIGHT)){
                dude.setPathExtention("");
                dude.SpriteRight();
                positionX = positionX + 10;
            }



        }

    }
}
