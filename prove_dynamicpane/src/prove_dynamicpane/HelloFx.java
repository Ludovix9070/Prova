package prove_dynamicpane;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;



public class HelloFx extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		
		primaryStage.setTitle("My Library");
		primaryStage.setScene(new Scene(root, 986,675));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
