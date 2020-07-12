package view;

import controller.MainController;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CustomizeView {

	private MainController controller;
	private Scene customizeScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button homeButton;
	private Button playButton;

	public CustomizeView(MainController mainController) {
		System.out.println("In CustomizeView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: orange");
		setupPane();
		setupEvents();
		customizeScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
		
	}
	
	private void setupPane() {
		System.out.println("In CustomizeView setupPane()");
		
		homeButton = new Button("Home"); 
		playButton = new Button("Play");
		mainPane.getChildren().addAll(homeButton, playButton);
	}

	private void setupEvents() {
		System.out.println("In CustomizeView setupEvents()");
		
		homeButton.setOnAction(e -> {
			controller.showOpenScene();
		});
		playButton.setOnAction(e -> {
			controller.showStoryScene();
		});
	}

	public Scene getScene() {
		System.out.println("In CustomizeView getScene()");
		
		return customizeScene;
	}

}
