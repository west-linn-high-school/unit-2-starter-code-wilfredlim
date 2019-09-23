import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Picture extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 50, "Good Morning!");
    Text question = new Text(120, 80, "How's it going?");
    Rectangle box = new Rectangle(0, 100, 500, 20);
    Circle sun = new Circle( 0, 110, 110);

    sun.setStroke(Color.YELLOW);
    sun.setFill(Color.YELLOW);
    box.setStroke(Color.GREEN);
    box.setFill(Color.GREEN);

    Group root = new Group(hello, question, box);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTBLUE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
