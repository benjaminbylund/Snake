

import javax.swing.*;
import java.awt.*;



public class Board extends JFrame{

    //Double buffering
    Image dbImage;
    Graphics dbg;

    Food f = new Food(100, 100,100 ,100);
    Snake s = new Snake(500,100, 100, 10);

    //Screen size
    int WIDTH = 720;
    int HEIGHT = 480;

    //Dimension of the ScreenWidth * ScreenHeight
    Dimension screenSize = new Dimension(WIDTH, HEIGHT);

    boolean running = false;

    //Constructor
    public Board() {
        this.setTitle("Snake");
        this.setSize(screenSize);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);

        //Creating and starting threads
        Thread food = new Thread(f);
        Thread player = new Thread(s);
        food.start();
       // player.start();

        running = true;

        //Main loop
        long lastUpdate = System.nanoTime();
        int fps = 60;
        long dt = 1000000000/fps;

        while(running) {
            if (System.nanoTime() - lastUpdate > dt){
                lastUpdate = System.nanoTime();
                draw();
            }
        }
    }
        public void draw(){
            dbImage = createImage(getWidth(), getHeight());
            dbg = dbImage.getGraphics();
            f.draw(dbg);
            s.draw(dbg);

            dbg.setColor(Color.white);
            dbg.drawString("Score: "+s.score, 15, 50);

            getGraphics().drawImage(dbImage, 0, 0, this);
    }


    public static void main(String[] args) {
        Board board = new Board();

    }
}
