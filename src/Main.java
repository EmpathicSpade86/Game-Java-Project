import java.io.File;
import java.util.Scanner;
import java.util.*;

import static java.awt.event.KeyEvent.*;

public class Main {

    public static void main(String[] args) {
        Sprite dude = new Sprite("carly", "mainguy/", 1);
        GameObject tester = new MovingObject(100,250, dude, 0 , 0);
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0,500);

        dude.SpriteDown();

        while(true)
        {

            StdDraw.picture(250,250,"Sprites/" + dude.getPath() + "(" + dude.getFrame() + ").png");
            dude.animate();
            StdDraw.show();StdDraw.clear();
            try {
                Thread.sleep(160,66667);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        //int rooms = ((int) ((Math.random()*5) +5)) + 1;

    }
}
