import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    //attributi del panel
    private final int WIDTH = 500;
    private final int HIGHT = 500;
    private final int UNIT_SIZE = 25;
    private final int GAME_UNIT = (WIDTH*HIGHT)/UNIT_SIZE;
    private final int DELAY = 75;
    private final int x[] = new int[GAME_UNIT];
    private final int y[] = new int[GAME_UNIT];
    private int body = 6;
    private int appleEaten;
    private int appleX;
    private int appleY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    //costruttore
    public GamePanel(){

    }

    //metodi
    public void startGame(){

    }

    public void paintComponents(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void checkApple(){

    }

    public void newApple(){

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }

    }



}
