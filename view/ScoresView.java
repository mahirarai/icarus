package view;

import controller.MainController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ScoresView {
	
	private MainController controller;
	private Scene scoresScene;
	private VBox mainPane;
	private int mainPaneHeight = 500;
	private int mainPaneWidth = 800;
	
	private Button homeButton; 
	
	public ScoresView(MainController mainController) {
		System.out.println("In ScoresView constructor");
		
		this.controller = controller;
		mainPane = new VBox();
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setSpacing(30);
		mainPane.setStyle("-fx-background-color: red");
		setupPane();
		setupEvents();
		scoresScene = new Scene(mainPane, mainPaneWidth, mainPaneHeight);
		
	}
	
	private void setupEvents() {
		System.out.println("In ScoresView setupEvents()");
		
		homeButton.setOnAction(e -> {
			controller.showOpenScene();
		});
		
	}

	private void setupPane() {
		System.out.println("In ScoresView setupPanes()");
		
		homeButton = new Button("Home"); 
		mainPane.getChildren().add(homeButton); 
	}

	public Scene getScene() {
		System.out.println("In ScoresView getScene()");
		
		return scoresScene;
	}

}
