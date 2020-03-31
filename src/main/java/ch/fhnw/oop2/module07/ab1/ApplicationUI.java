package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

import java.awt.*;

public class ApplicationUI extends FlowPane {
	private Button button;
	private int counter = 0;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button("Add label");
		button.setOnAction(button -> addLabel());

	}

	private void layoutControls() {
		getChildren().add(button);
		setPadding(new Insets(10));
	}

	private void addLabel() {
		Label label = new Label("Label " + ++counter);
		label.setPadding(new Insets(5));
		getChildren().add(label);
	}
}
