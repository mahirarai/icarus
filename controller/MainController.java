package controller;

import javafx.application.Application;
import javafx.stage.Stage;
import model.IcarusGame;
import view.CustomizeView;
import view.EndView;
import view.GameView;
import view.InstructionView;
import view.OpenView;
import view.ScoresView;
import view.StoryView;

public class MainController extends Application {
	
	private IcarusGame game;
	
	private Stage primaryStage;
	private OpenView openView;
	private GameView gameView;
	private StoryView storyView;
	private EndView endView;
	private CustomizeView customizeView;
	private InstructionView instructionView;
	private ScoresView scoresView; 
	
	// add or change for global features
	private String fontName = "";
	private String colorDark = "";
	private String colorLight = "";
	private String defaultButtonColor = "";
	private String hoverButtonColor = "";
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.game = new IcarusGame();
		
		setUpScenes(); 
		
		primaryStage.show(); 
	}

	private void setUpScenes() {
		openView = new OpenView(this);
		customizeView = new CustomizeView(this);
		instructionView = new InstructionView(this);
		scoresView = new ScoresView(this); 
		storyView = new StoryView(this);
		gameView = new GameView(this);
		endView = new EndView(this); 
	}
	
	public void showOpenScene() {
		primaryStage.setScene(openView.getScene());
		
	}
	
	public void showInstructionScene() {
		primaryStage.setScene(instructionView.getScene());
	}
	
	public void showScoresScene() {
		primaryStage.setScene(scoresView.getScene());
	}
	
	public void showCustomizeScene() {
		primaryStage.setScene(customizeView.getScene());
	}
	
	public void showStoryScene() {
		primaryStage.setScene(storyView.getScene());
	}

	public void showGameScene() {
		primaryStage.setScene(gameView.getScene());		
	}

	public void showEndScene() {
		primaryStage.setScene(endView.getScene());	
		
	}
	
	

}
