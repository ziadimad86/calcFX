package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FormCalcController {
	@FXML
	TextField txtFn;
	@FXML
	TextField txtSn;
	@FXML
	Label txtR;

	@FXML
	RadioButton rdbSum;
	@FXML
	RadioButton rdbSub;
	@FXML
	RadioButton rdbMul;
	@FXML
	RadioButton rdbDiv;
	@FXML
	protected void GetResult() {
		double result=0;
		if(rdbSum.isSelected()) {
			result = Double.parseDouble(txtFn.getText()) + Integer.parseInt(txtSn.getText());
		}
		else {
			if(rdbSub.isSelected()) {
				result = Double.parseDouble(txtFn.getText()) - Integer.parseInt(txtSn.getText());
			}
			else {
				if(rdbMul.isSelected()) {
					result = Double.parseDouble(txtFn.getText()) * Integer.parseInt(txtSn.getText());
				}
				else {
					if(rdbDiv.isSelected()) {
						result = Double.parseDouble(txtFn.getText()) / Integer.parseInt(txtSn.getText());
					}
				}
			}
		}
		txtR.setText(String.valueOf(result));
	}
}
