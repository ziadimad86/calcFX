package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Form3Cotroller implements Initializable {

	@FXML
	TextField txtUsr;
	@FXML
	TextField txtPsw;
	@FXML
	ComboBox<String> mycombo;
	@FXML
	protected void CheckUser() {
		if(txtUsr.getText().equals("admin") && 
				txtPsw.getText().equals("1234")) {
			System.out.println("Welcome Admin");
			mycombo.getItems().addAll("Erbil","Basrah");
		}
		else {
			System.out.println("Invalid User Name or Password");
		}
	}
	
	ObservableList<String> list=FXCollections.observableArrayList("Baghdad","Kirkuk","Wasit");
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		mycombo.setItems(list);
	}
}
