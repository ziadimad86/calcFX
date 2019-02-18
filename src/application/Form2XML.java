package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Form2XML extends Application {

	

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Form2.fxml"));
		Scene scene = new Scene(root, 450, 300);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
	

	

}
