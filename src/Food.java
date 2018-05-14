import java.awt.*;

public class Food implements Runnable {

    //food object
    Rectangle food;


    public Food(int x, int y, int width , int height) {
        food = new Rectangle(10, 10);

        this.food.x = x;
        this.food.y = y;
        this.food.width = width;
        this.food.height = height;
    /*
        setBounds(x,y,width,height); */
    }


    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(this.food.x, this.food.y, this.food.width, this.food.height);

    }

    @Override
    public void run() {

    }
}
