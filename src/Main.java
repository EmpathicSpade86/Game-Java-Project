import javax.swing.plaf.synth.SynthPopupMenuUI;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.*;

import static java.awt.event.KeyEvent.*;

public class Main {

    public static void main(String[] args) {
        Sprite dude = new Sprite("bob", "maingirl/", 1);
        MovingObject tester = new MainChar(500,500, dude, 0 , 0, 500, 0, false);

        Sprite zombie1 = new Sprite("karen", "zom1/", 1 );
        Sprite zombie2 = new Sprite("LoganEvanWill", "zom2/", 1);

        MovingObject zom1 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom2 = new EnemChar(1250, 1250, zombie2, 0,0,1000, 1,10,false);

        StdDraw.enableDoubleBuffering();

        int Scale = 2000;
        StdDraw.setScale(0,Scale);

        dude.SpriteIdle();

        zombie1.SpriteIdle();
        zombie2.SpriteIdle();




        while(true)
        {
            StdDraw.picture(zom1.getVx(),zom1.getVy(), "Sprites/" + zombie1.getPath() + "(" +zombie1.getFrame() + ").png");
            zombie1.animate();
            StdDraw.picture(tester.getVx(),tester.getVy(),"Sprites/" + dude.getPath() + "(" + dude.getFrame() + ").png");
            dude.animate();
            StdDraw.show();
            StdDraw.clear();
            try {
                Thread.sleep(160,66667);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //tester.setHealth(tester.getHealth()-10); // Health Working
            if (tester.getHealth() <= 0){
                dude.setPathExtention("");
                dude.SpriteDead();
                tester.setHealth(1);
                System.exit(0);
            }
            StdDraw.setPenColor(Color.RED);
            StdDraw.filledRectangle(0,Scale,tester.getHealth(),50);

            if (StdDraw.isKeyPressed(VK_DOWN)){
                dude.setPathExtention("");
                dude.SpriteDown();
                tester.setVy(tester.getVy()-10);
            }
            if (StdDraw.isKeyPressed(VK_UP)){
                dude.setPathExtention("");
                dude.SpriteUp();
                tester.setVy(tester.getVy()+10);
            }
            if (StdDraw.isKeyPressed(VK_LEFT)){
                dude.setPathExtention("");
                dude.SpriteLeft();
                tester.setVx(tester.getVx()-10);
            }
            if (StdDraw.isKeyPressed(VK_RIGHT)){
                dude.setPathExtention("");
                dude.SpriteRight();
                tester.setVx(tester.getVx()+10);
            }
            //Zombie Moving Mechanics


            // Taking away Health due to zombie "bite"
            if (tester.getVy() == zom1.getVy() && tester.getVx() == zom1.getVx()){
                tester.setHealth(tester.getHealth()-10);
            }


        }

    }
}
