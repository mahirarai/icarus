package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class InstructionView {
	
	private MainController controller;
	private Scene instructionScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button homeButton; 

	public InstructionView(MainController mainController) {
		System.out.println("In InstructionView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: pink");
		setupPane();
		setupEvents();
		instructionScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
	}
	
	private void setupEvents() {
		System.out.println("In InstructionView setupEvents()");
		
		homeButton.setOnAction(e -> {
			controller.showOpenScene();
		});
		
	}

	private void setupPane() {
		System.out.println("In InstructionView setupPane()");
		
		homeButton = new Button("Home");
		mainPane.getChildren().add(homeButton);
		
	}

	public Scene getScene() {
		System.out.println("In InstructionView getScene()");
		
		return instructionScene;
	}

}
