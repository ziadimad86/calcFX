package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FormTreeViewController {
	@FXML
	TreeView<String> myTreeView;
	@FXML
	ListView<String> myList;

	@FXML
	protected void AddTreeClick() {
		System.out.println("begin");
		Image icon = new Image(getClass().getResourceAsStream("/application/folder.png"));

		TreeItem<String> root = new TreeItem<String>("Resturant", new ImageView(icon));

		TreeItem<String> nodeA = new TreeItem<>("Food", new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("Drink", new ImageView(icon));
		root.getChildren().addAll(nodeA, nodeB);

		TreeItem<String> nodeA1 = new TreeItem<>("Burger", new ImageView(icon));
		TreeItem<String> nodeA2 = new TreeItem<>("Pitza", new ImageView(icon));
		TreeItem<String> nodeB1 = new TreeItem<>("Juice", new ImageView(icon));
		TreeItem<String> nodeB2 = new TreeItem<>("Softdrink", new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1, nodeA2);
		nodeB.getChildren().addAll(nodeB1, nodeB2);
		myTreeView.setRoot(root);
		System.out.println("end");
	}
	@FXML
	public void mouseClick(MouseEvent mouse) {
		if (mouse.getClickCount() == 2) {
			TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());
			myList.getItems().addAll(item.getValue());
		}
	}

}
