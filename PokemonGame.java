import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class PokemonGame extends JPanel implements Runnable, KeyListener {

    // Window
    JFrame window;
    Thread gameThread;

    final int tileSize = 32;
    final int cols = 20;
    final int rows = 15;

    // Player
    int playerX = 5 * tileSize;
    int playerY = 5 * tileSize;
    int speed = 4;

    boolean up, down, left, right;

    // Game state
    String state = "START"; // START, WORLD, BATTLE
    String starter = "";

    // Map (0 = floor, 1 = wall, 2 = grass)
    int[][] map = {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1},
        {1,0,1,1,1,0,0,0,2,2,0,0,1,1,1,0,0,0,0,1},
        {1,0,0,0,1,0,0,0,0,2,0,0,1,0,0,0,2,0,0,1},
        {1,0,0,0,1,0,2,2,0,0,0,0,1,0,0,0,2,0,0,1},
        {1,0,0,0,0,0,2,0,0,0,2,0,0,0,1,0,0,0,0,1},
        {1,0,1,1,1,0,2,0,0,0,2,0,1,1,1,0,2,2,0,1},
        {1,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,2,0,0,1},
        {1,0,0,2,2,0,0,0,0,0,0,0,2,2,0,0,0,0,0,1},
        {1,0,0,0,2,0,1,1,1,0,0,0,0,2,0,1,1,0,0,1},
        {1,0,0,0,2,0,0,0,1,0,2,2,0,2,0,0,0,0,0,1},
        {1,0,0,0,0,0,2,0,0,0,2,0,0,0,0,2,2,0,0,1},
        {1,0,1,1,1,0,2,2,0,0,2,0,1,1,1,0,0,0,0,1},
        {1,2,2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,2,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    // Battle
    int playerHP = 100;
    int enemyHP = 50;
    String battleText = "A wild Pyron appeared!";
    Random rand = new Random();

    public PokemonGame() {
        window = new JFrame("Pokemon: Ember Eclipse");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(this);
        window.setSize(cols * tileSize, rows * tileSize);
        window.setResizable(false);
        window.setVisible(true);

        this.addKeyListener(this);
        this.setFocusable(true);

        startGame();
    }

    public void startGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        while (true) {
            update();
            repaint();
            try { Thread.sleep(16); } catch (Exception e) {}
        }
    }

    public void update() {
        if (state.equals("WORLD")) {
            int newX = playerX;
            int newY = playerY;

            if (up) newY -= speed;
            if (down) newY += speed;
            if (left) newX -= speed;
            if (right) newX += speed;

            int col = newX / tileSize;
            int row = newY / tileSize;

            if (map[row][col] != 1) {
                playerX = newX;
                playerY = newY;

                if (map[row][col] == 2 && rand.nextInt(100) < 2) {
                    state = "BATTLE";
                    enemyHP = 50;
                }
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (state.equals("START")) {
            g.drawString("Choose Starter:", 200, 150);
            g.drawString("1 - Flameling (Fire)", 200, 180);
            g.drawString("2 - Aquava (Water)", 200, 200);
            g.drawString("3 - Florabud (Grass)", 200, 220);
        }

        else if (state.equals("WORLD")) {
            // Draw map
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (map[r][c] == 1) g.setColor(Color.darkGray);
                    else if (map[r][c] == 2) g.setColor(Color.green);
                    else g.setColor(Color.lightGray);

                    g.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
                }
            }

            // Player
            g.setColor(Color.blue);
            g.fillRect(playerX, playerY, tileSize, tileSize);
        }

        else if (state.equals("BATTLE")) {
            g.drawString("BATTLE!", 200, 100);
            g.drawString("Your HP: " + playerHP, 200, 150);
            g.drawString("Enemy HP: " + enemyHP, 200, 180);
            g.drawString("Press SPACE to attack", 200, 220);
            g.drawString(battleText, 200, 260);
        }
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (state.equals("START")) {
            if (code == KeyEvent.VK_1) { starter = "Flameling"; state = "WORLD"; }
            if (code == KeyEvent.VK_2) { starter = "Aquava"; state = "WORLD"; }
            if (code == KeyEvent.VK_3) { starter = "Florabud"; state = "WORLD"; }
        }

        else if (state.equals("WORLD")) {
            if (code == KeyEvent.VK_W) up = true;
            if (code == KeyEvent.VK_S) down = true;
            if (code == KeyEvent.VK_A) left = true;
            if (code == KeyEvent.VK_D) right = true;
        }

        else if (state.equals("BATTLE")) {
            if (code == KeyEvent.VK_SPACE) {
                int damage = rand.nextInt(10) + 5;
                enemyHP -= damage;
                battleText = "You dealt " + damage + "!";

                if (enemyHP <= 0) {
                    state = "WORLD";
                    battleText = "You won!";
                } else {
                    int enemyDamage = rand.nextInt(8) + 3;
                    playerHP -= enemyDamage;
                    battleText += " Enemy hit " + enemyDamage;

                    if (playerHP <= 0) {
                        playerHP = 100;
                        state = "START";
                    }
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) up = false;
        if (code == KeyEvent.VK_S) down = false;
        if (code == KeyEvent.VK_A) left = false;
        if (code == KeyEvent.VK_D) right = false;
    }

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new PokemonGame();
    }
}