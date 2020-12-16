
package netflix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import netflix.Login.Login;


public class Netflix extends Application {
    
    public static Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        Netflix.stage=stage;
       
        Login root = new Login();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
