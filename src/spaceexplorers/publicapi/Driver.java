package spaceexplorers.publicapi;

import spaceexplorers.core.GameWindow;
import spaceexplorers.strategies.*;

import javax.swing.*;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        try {
            // You can either instantiate the GameWindow by specifying two strategy classes directly, or by
            // using the default constructor and picking the strategies at run time
            // GameWindow window = new GameWindow();
            // false means you are player2. Player2 will be BLUE in the graphics.

            // Choose both strategies in game window
            GameWindow window = new GameWindow();
            //GameWindow window = new GameWindow(StudentStrategy.class,false);

            // Choose player1 strategies in game window
            //GameWindow window = new GameWindow(RandomStrategy.class, false);

            // No strategies chosen in game window
            // GameWindow window = new GameWindow(Strategy.class, Strategy.class);

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            window.setResizable(false);
            window.setLocationRelativeTo(null);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry the game could not start");
            e.printStackTrace();
        }
    }
}
