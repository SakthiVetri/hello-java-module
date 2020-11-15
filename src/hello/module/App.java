package hello.module;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class App extends Application {

   public static void main(String[] args) {
      Application.launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("Congratulation!");
      alert.setHeaderText("You did it. The application is running. Press OK to close");
      alert.setContentText("You have successfully created a custom image");
      alert.showAndWait().ifPresent(rs -> {
         if (rs == ButtonType.OK) {
            System.out.println("Pressed OK.");
         }
      });
   }
}
