package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Form2Controller {

	@FXML
	TextField txtUn;
	@FXML
	TextField txtPw;
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		txtUn.setText("Aaa");
		txtPw.setText("Bbbb");
	}
}
