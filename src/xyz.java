import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class xyz extends Application {

    public static void main(String[] args) {
        byte keyboardKeys = 64;
        System.out.println("Keyboard that I use has " + keyboardKeys + " keys");
        short stepsToUniversity = 1443;
        System.out.println("I have to make " + stepsToUniversity + " steps to get the 8 campus");
        int screenPixels = 4096000;
        System.out.println("My screen has " + screenPixels + " pixels");
        long bigger = 999999999;
        System.out.println("Some big number that I could input to 'long' variable is " + bigger);
        float squareUniversity = 2.8512F;
        System.out.println("Square of the university were I'm studying is " +  squareUniversity + " hectare");
        double yoyoSquare = Math.PI * Math.pow(27.4, 2);
        System.out.println("Square of circle of my yoyo is " + yoyoSquare);
        char nameBegins = 'O';
        System.out.println("My name begins form " + nameBegins + " letter");
        boolean logic = true;
        System.out.println("I've been in Romania this summer, it is " + logic);
        LocalDateTime CompileDate = LocalDateTime.now();
        System.out.println(CompileDate);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
