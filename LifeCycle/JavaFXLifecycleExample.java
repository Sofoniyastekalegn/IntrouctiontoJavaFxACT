import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class JavaFXLifecycleExample extends Application {
    @Override 
    public void init() {
        System.out.println("Initialization Phase: Resource loaded.");


    }
    @Override 
    public void start(Stage primaryStage) {
        System.out.println("Execution Phase: Setting up UI.");
        Label label = new Label("Hello JavaFX!");
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Lifecycle Example");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    @Override
    public void stop() {
        System.out.println("Termination phase: Cleaning up resources.");

    }

    public static void main(String[] args) {
        launch(args);
    }
}