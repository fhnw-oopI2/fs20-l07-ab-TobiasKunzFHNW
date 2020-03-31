package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Starter extends Application {
	private final static int HEIGHT = 600;
	private final static int WIDTH = 800;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Parent rootPane = new ApplicationUI();
		Scene myScene = new Scene(rootPane);

		primaryStage.setTitle("Arbeitsblatt (1)");
		primaryStage.setHeight(HEIGHT);
		primaryStage.setWidth(WIDTH);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}