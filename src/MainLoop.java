/* Benjamin Bylund
   2018-**-**
   Ah det ska vara ett spel men det är vad det är.
*/

public class MainLoop implements Runnable {

    private Snake player;
    private Food food;
    private Board board;
    private KeyManager keyManager;

    //Main loop
    private long lastUpdate = System.nanoTime();
    private int fps = 60;
    private long dt = 1000000000/fps;


    public MainLoop(Snake player, Food food, Board board, KeyManager keyManager){
        this.player = player;
        this.food = food;
        this.board = board;
        this.keyManager = keyManager;

    }

    private void update(){
        checkFood(player, food);
    }

    private void checkFood(Snake player, Food food){
        /* if (player.intersects(food)) {
            System.out.println("RÖR INTE MATEN");
        } */
    }

    @Override
    public void run() {
        boolean running;

        while(running = true) {
            if (System.nanoTime() - lastUpdate > dt){
                lastUpdate = System.nanoTime();
                update();
                draw();
            }
        }
    }

    private void draw() {
        board.draw();

    }
}
