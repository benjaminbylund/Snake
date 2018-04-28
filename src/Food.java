import java.awt.*;

public class Food implements Runnable {

    public Food(int x, int y, int height , int width) {

    }


    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(100, 100, 10, 10);

    }

    @Override
    public void run() {

    }
}
