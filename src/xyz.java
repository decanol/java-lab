import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class xyz extends Application {

    public static void main(String[] args) {
        byte cnuParts = 17;
        short maxMark = 100;
        int stepsToUniversity = 1443;
        long indiaDemographic = 1283370000L;
        float distanceBetweenCampus = 4.9F;
        double squareUniversity = 2.8512D;
        char exitProgram = 'Q';
        boolean logic = true;
        LocalDateTime CompileDate = LocalDateTime.now();
        System.out.println("Hello, World!");
        System.out.println("This is the first laboratory work, there are variables with different data types examples");
        System.out.println("Maximal mark is " + maxMark + " points");
        System.out.println("I have to make " + stepsToUniversity + "steps to get the 8 campus");
        System.out.println(squareUniversity + " hectare is square of CNU 8 and 9 campuses. CNU has " + cnuParts + " of it");
        System.out.println("Distance between 8 campus and Residence of Bukovinian and Dalmatian Metropolitans is " + distanceBetweenCampus);
        System.out.println("2 x 2 = 4 equal to " + logic);
        System.out.println("India demographic is " + indiaDemographic);
        System.out.println("Press button combination 'command' + '" + exitProgram + "' to exit current program");
        System.out.println("Date of program compiling is: " + CompileDate);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
