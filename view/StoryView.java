package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class StoryView {
	
	private MainController controller;
	private Scene storyScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button homeButton; 
	private Button skipButton;
	
	public StoryView(MainController mainController) {
		System.out.println("In StoryView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: yellow");
		setupPane();
		setupEvents();
		storyScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
	}
	
	private void setupPane() {
		System.out.println("In StoryView setupPane()");
		
		homeButton = new Button("Home"); 
		skipButton = new Button("Skip");
		mainPane.getChildren().addAll(skipButton, homeButton);
	}
	
	private void setupEvents() {
		System.out.println("In StoryView setupEvents()");
		
		homeButton.setOnAction(e -> {
			controller.showOpenScene();
		});
		skipButton.setOnAction(e -> {
			controller.showGameScene();
		});
	}

	public Scene getScene() {
		System.out.println("In StoryView getScene()");
		
		return storyScene;
	}


}
