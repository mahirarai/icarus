package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class GameView {
	
	private MainController controller;
	private Scene gameScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button endButton; 
	
	public GameView(MainController mainController) {
		System.out.println("In GameView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setStyle("-fx-background-color: green");
		setupPane();
		setupEvents();
		gameScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
	}
	
	private void setupPane() {
		System.out.println("In GameView setupPane()");
		
		endButton = new Button("End"); 
		mainPane.getChildren().addAll(endButton);
	}
	
	private void setupEvents() {
		System.out.println("In GameView setupEvents()");
		
		endButton.setOnAction(e -> {
			controller.showEndScene();
		});
		
	}

	public Scene getScene() {
		System.out.println("In GameView getScene()");
		
		return gameScene;
	}


}
