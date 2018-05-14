

public class MainLoop implements Runnable {

    Snake player;
    Food food;
    Board board;
    KeyManager keyManager;

    //Main loop
    long lastUpdate = System.nanoTime();
    int fps = 60;
    long dt = 1000000000/fps;


    public MainLoop(Snake player, Food food, Board board, KeyManager keyManager){
        this.player = player;
        this.food = food;
        this.board = board;
        this.keyManager = keyManager;

    }

    public void update(){
        checkFood(player, food);
    }

    private void checkFood(Snake player, Food food){
        /*if (player.intersects(food)) {
            System.out.println("RÖR INTE MATEN");
        } */
    }

    @Override
    public void run() {
        boolean running = true;

        while(running) {
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
