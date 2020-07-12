package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EndView {
	
	private MainController controller;
	private Scene endScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button homeButton; 

	
	public EndView(MainController mainController) {
		System.out.println("In EndView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: blue");
		setupPane();
		setupEvents();
		endScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);	
		
	}
	
	private void setupPane() {
		System.out.println("In EndView setupPane()");
		
		homeButton = new Button("Home"); 
		mainPane.getChildren().addAll(homeButton);
	}
	
	private void setupEvents() {
		System.out.println("In EndView setupEvents()");
		
		homeButton.setOnAction(e -> {
			controller.showOpenScene();
		});
		
	}

	public Scene getScene() {
		System.out.println("In EndView getScene()");
		
		return endScene;
	}

}
