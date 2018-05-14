import java.awt.*;


public class Snake implements Runnable {

    //Player object
    Rectangle player;

    //inputs
    public KeyManager keyManager;

    //Score
    int score;

    public Snake(int x, int y,int width, int height){

        //Making the player
        player = new Rectangle(10, 10);

        this.player.x = x;
        this.player.y = y;
        this.player.width = width;
        this.player.height = height;

        //The score
        score = 0;

        //Making the KeyManager
        keyManager = new KeyManager();
    }

    public void collision(){

    }

    public void getInputs(){
        int speed = 10;
        if (keyManager.up){
            this.player.y -= speed;
        }
        if (keyManager.down){
            this.player.y += speed;
        }
        if (keyManager.left){
            this.player.x -= speed;
        }
        if (keyManager.right){
            this.player.x += speed;
        }
    }


    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(this.player.x, this.player.y, this.player.width, this.player.height);
    }

    @Override
    public void run() {
        try {
            while(true){
                update();
                Thread.sleep(100);
            }
        }catch (Exception e){System.err.println(e.getMessage());
        }
    }

    public void update() {
        keyManager.update();
        getInputs();
    }
}
