package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class OpenView {
	
	private MainController controller;
	private Scene openScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Label titleLabel;
	private Button beginButton;
	private Button scoresButton;
	private Button instructionsButton;

	public OpenView(MainController mainController) {
		System.out.println("In OpenView Constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: white");
		setupPane();
		setupEvents();
		openScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
		
	}

	private void setupPane() {
		System.out.println("In OpenView setupPane()");
		
		beginButton = new Button("Begin");
		scoresButton = new Button("Top Scores");
		instructionsButton = new Button("How to Play");
		mainPane.getChildren().addAll(beginButton, scoresButton, 
				instructionsButton);
	}

	private void setupEvents() {
		System.out.println("In OpenView setupEvents()");
		
		beginButton.setOnAction(e -> {
			controller.showCustomizeScene();
		});
		
		scoresButton.setOnAction(e -> {
			controller.showScoresScene();
		});
		
		instructionsButton.setOnAction(e -> {
			controller.showInstructionScene();
		});
		
	}

	public Scene getScene() {
		System.out.println("In OpenView getScene()");
		
		return openScene;
	}

}
