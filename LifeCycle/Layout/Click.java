import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class HelloWorldButtonApp extends Application {
 @Override
 public void start(Stage primaryStage) { 
 Button btn = new Button("Click Me!"); // Create a Button
 // Set an action for the button, which prints to the console
 btn.setOnAction(event -> System.out.println("Hello World!"));
 // Create a layout and add the button to it
 StackPane root = new StackPane();
 root.getChildren().add(btn);
 // Create a Scene and set it to the Stage
 Scene scene = new Scene(root, 300, 200);
 primaryStage.setTitle("Hello World Button App");
 primaryStage.setScene(scene); 
 primaryStage.show(); // Show the Stage
 }
 public static void main(String[] args) {
 launch(args); // Called in the main()
 } // Used to initiate the JavaFX App
} 
JavaFX Layouts