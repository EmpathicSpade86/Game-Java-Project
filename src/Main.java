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

        Sprite barrier = new Sprite("Barrier","");

        MovingObject zom1 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom2 = new EnemChar(1000, 1000, zombie2, 0, 0, 1000, 1, 10, false);
        MovingObject zom3 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom4 = new EnemChar(1000, 1000, zombie2, 0, 0, 1000, 1, 10, false);
        MovingObject zom5 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom6 = new EnemChar(1000, 1000, zombie2, 0, 0, 1000, 1, 10, false);
        MovingObject zom7 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom8 = new EnemChar(1000, 1000, zombie2, 0, 0, 1000, 1, 10, false);
        MovingObject zom9 = new EnemChar(1000, 1000, zombie1, 0, 0, 1000, 1, 10, false);
        MovingObject zom10 = new EnemChar(1000, 1000, zombie2, 0, 0, 1000, 1, 10, false);


        StdDraw.enableDoubleBuffering();

        int Scale = 2000;
        StdDraw.setScale(0,Scale);

        dude.SpriteIdle();
        zombie1.SpriteIdle();
        zombie2.SpriteIdle();



        while(true)
        {
            zom1.Draw(zombie1,zom1);
            zom2.Draw(zombie2,zom2);
            zom3.Draw(zombie1,zom3);
            zom4.Draw(zombie2,zom4);
            zom5.Draw(zombie1,zom5);
            zom6.Draw(zombie2,zom6);
            zom7.Draw(zombie1,zom7);
            zom8.Draw(zombie2,zom8);
            zom9.Draw(zombie1,zom9);
            zom10.Draw(zombie2,zom10);

            zombie1.animate();
            zombie2.animate();

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

            if(tester.getHealth() > 0){
                tester.MoveChar(dude,tester, 20);
            }
            //Zombie Moving Mechanics

            //double distanceZom1 = Math.sqrt(((tester.getVx()-zom1.getVx())*(tester.getVx()-zom1.getVx())) + ((tester.getVy()-zom1.getVy()) * (tester.getVy()-zom1.getVy())));
            zom1.MoveTowards(zom1,tester);
            zom1.MoveTowards(zom2,tester);
            zom1.MoveTowards(zom3,tester);
            zom1.MoveTowards(zom4,tester);
            zom1.MoveTowards(zom5,tester);
            zom1.MoveTowards(zom6,tester);
            zom1.MoveTowards(zom7,tester);
            zom1.MoveTowards(zom8,tester);
            zom1.MoveTowards(zom9,tester);
            zom1.MoveTowards(zom10,tester);

            zom1.AreaOfDamage(zom1,tester);
            zom1.AreaOfDamage(zom2,tester);
            zom1.AreaOfDamage(zom3,tester);
            zom1.AreaOfDamage(zom4,tester);
            zom1.AreaOfDamage(zom5,tester);
            zom1.AreaOfDamage(zom6,tester);
            zom1.AreaOfDamage(zom7,tester);
            zom1.AreaOfDamage(zom8,tester);
            zom1.AreaOfDamage(zom9,tester);
            zom1.AreaOfDamage(zom10,tester);


            // Taking away Health due to zombie "bite"
            if (tester.getVy() == zom1.getVy() && tester.getVx() == zom1.getVx()){
                tester.setHealth(tester.getHealth()-10);
                if (tester.getHealth() > 0){
                    zom1.MoveTowards(zom1, tester);
                }
            }

            //Zombie Spawning Mechanics

            //Zombie Killing Mechanics


        }

    }
}
