import java.awt.*;


public class Snake implements Runnable {
     int x , y , width, height;

    //Player object
    Rectangle player;

    //inputs
    private KeyManager keyManager;

    //Score
    int score;

    public Snake(int x, int y,int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        score = 0;

        keyManager = new KeyManager();

        player = new Rectangle(10, 100);
    }

    public void collision(){

    }

    public void getInputs(){
        x = 0;
        y = 0;
        int speed = 10;


        if (keyManager.up){
            y = -speed;
        }
        if (keyManager.down){
            y = speed;
        }
        if (keyManager.left){
            x = -speed;
        }
        if (keyManager.right){
            x = speed;
        }
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(500, 100, player.width, player.height);
    }

    @Override
    public void run() {
        try {
            while(true){
                getInputs();
            }
        }catch (Exception e){System.err.println(e.getMessage());
        }
    }


}
